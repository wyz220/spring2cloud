package consumer.controller.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClient(name = "provider-user", configuration = UserRibbonConfiguration.class)
public class UserRibbonConfiguration {

}
