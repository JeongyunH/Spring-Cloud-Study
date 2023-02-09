package info.fc.photoapp.config;

import info.fc.photoapp.api.MDCLogFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class WebConfig {
    @Bean
    public FilterRegistrationBean getFilterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new MDCLogFilter());
        registrationBean.setUrlPatterns(Arrays.asList("/v1/*"));
        return registrationBean;
    }
}
