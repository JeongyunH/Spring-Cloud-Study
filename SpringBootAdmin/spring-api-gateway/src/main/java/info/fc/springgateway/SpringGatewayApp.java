package info.fc.springgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringGatewayApp {
    public static void main(String ar[]) {
        SpringApplication.run(SpringGatewayApp.class);
    }
}
