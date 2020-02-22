package org.shadow.invoke.example;

import org.shadow.invoke.example.model.Specialty;
import org.shadow.invoke.example.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new Specialty.StringConverter());
    }

    @Bean
    public SecretAgentDetails secretAgentDetails() {
        return new DefaultSecretAgentDetailsImpl();
    }

    @Bean
    public SecretAgentDistance secretAgentDistance() {
        return new DefaultSecretAgentDistanceImpl();
    }

    @Bean
    public SecretAgentSelector secretAgentSelector() {
        return new DefaultSecretAgentSelectorImpl();
    }
}