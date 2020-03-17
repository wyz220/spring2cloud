package com.wyz;

import com.wyz.filter.PreRequestLogFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ZuulHAApplication {
  public static void main(String[] args) {
    SpringApplication.run(ZuulHAApplication.class, args);
  }
    @Bean
    public PreRequestLogFilter preRequestLogFilter() {

    return new PreRequestLogFilter();
    }
}
