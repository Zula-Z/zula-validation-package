package com.zula.validation.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.validation.Validator;

@Configuration
@ConditionalOnClass(Validator.class)
@EnableConfigurationProperties(ValidationProperties.class)
public class ValidationAutoConfig {
}