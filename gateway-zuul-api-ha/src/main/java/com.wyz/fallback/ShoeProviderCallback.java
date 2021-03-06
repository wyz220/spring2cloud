package com.wyz.fallback;

import com.wyz.filter.PreRequestLogFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

@Component
public class ShoeProviderCallback implements FallbackProvider {

    private static final Logger LOGGER = LoggerFactory.getLogger(ShoeProviderCallback.class);


    @Override
    public String getRoute() {
        return "CONSUME-SHOE-HYSTRIX";
    }

    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        return new ClientHttpResponse() {
            @Override
            public HttpStatus getStatusCode() throws IOException {
                // fallback时的状态码
                return HttpStatus.OK;
            }

            @Override
            public int getRawStatusCode() throws IOException {
                // 数字类型的状态码，本例返回的其实就是200，详见HttpStatus
                return this.getStatusCode().value();
            }

            @Override
            public String getStatusText() throws IOException {
                // 状态文本，本例返回的其实就是OK，详见HttpStatus
                return this.getStatusCode().getReasonPhrase();
            }

            @Override
            public void close() {
            }

            @Override
            public InputStream getBody() throws IOException {
                // 响应体
                return new ByteArrayInputStream("鞋款微服务不可用，请稍后再试。-ha".getBytes());
            }

            @Override
            public HttpHeaders getHeaders() {
                // headers设定
                HttpHeaders headers = new HttpHeaders();
                MediaType mt = new MediaType("application", "json", Charset.forName("UTF-8"));
                headers.setContentType(mt);

                return headers;
            }
        };
    }
}
