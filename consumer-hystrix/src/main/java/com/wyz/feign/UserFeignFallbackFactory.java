package com.wyz.feign;

import com.wyz.entity.User;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class UserFeignFallbackFactory implements FallbackFactory<UserFeign> {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserFeignFallbackFactory.class);

    @Override
    public UserFeign create(Throwable throwable) {
        return new UserFeign(){

            @Override
            public User getById(Long id) {
// 日志最好放在各个fallback方法中，而不要直接放在create方法中。
                // 否则在引用启动时，就会打印该日志。
                // 详见https://github.com/spring-cloud/spring-cloud-netflix/issues/1471
                UserFeignFallbackFactory.LOGGER.info("fallback; reason was:", throwable);
                User user = new User();
                user.setId(-1L);
                user.setUsername("默认用户");
                return user;
            }

            @Override
            public User get0(User user) {
                return null;
            }

            @Override
            public User get1(Long id, String username) {
                return null;
            }

            @Override
            public User get2(Map<String, Object> map) {
                return null;
            }

            @Override
            public User post(User user) {
                return null;
            }
        };
    }
}
