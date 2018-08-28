package com.github.willpdp.springboot.configuration;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@SpringBootConfiguration
public class MicroserviceConfiguration {

    @Bean
    public CommonsRequestLoggingFilter getCommonsRequestLoggingFilter() {
        final CommonsRequestLoggingFilter commonsRequestLoggingFilter = new CommonsRequestLoggingFilter();
        commonsRequestLoggingFilter.setIncludeClientInfo(true);
        commonsRequestLoggingFilter.setIncludePayload(false);
        commonsRequestLoggingFilter.setIncludeQueryString(true);
        commonsRequestLoggingFilter.setIncludeHeaders(false);
        return commonsRequestLoggingFilter;
    }
}
