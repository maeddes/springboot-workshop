package com.example.jersey.config;

import com.example.jersey.jersey.WelcomeComponent;
import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.invoke.MethodHandle;

@Configuration
public class ResourceConfiguration {

    private static final Logger log = LoggerFactory.getLogger(MethodHandle.class.getName());

    // add more components if necessary
    @Bean
    public ResourceConfig resourceConfig() {
        return new ResourceConfig().register(WelcomeComponent.class);
    }
}
