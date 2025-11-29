package com.zula.validation.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "zula.validation")
public class ValidationProperties {
    private boolean enabled = true;
    private boolean failFast = true;

    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }

    public boolean isFailFast() { return failFast; }
    public void setFailFast(boolean failFast) { this.failFast = failFast; }
}package com.zula.validation.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.validation.Validator;

@Configuration
@ConditionalOnClass(Validator.class)
@EnableConfigurationProperties(ValidationProperties.class)
public class ValidationAutoConfig {
}