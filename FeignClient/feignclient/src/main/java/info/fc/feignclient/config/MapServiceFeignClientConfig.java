package info.fc.feignclient.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "info.fc.feignclient.mapService")
public class MapServiceFeignClientConfig {
}
