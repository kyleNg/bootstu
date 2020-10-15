package com.kyle;

import javax.validation.Validator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
public class ValidatorConfiguration {
    public ResourceBundleMessageSource getMessageSource() throws Exception {  
        ResourceBundleMessageSource rbms = new ResourceBundleMessageSource();  
        rbms.setDefaultEncoding("UTF-8");  
        rbms.setBasenames("i18n/message");  
        return rbms;  
    }  
  
    @Bean  
    public Validator getValidator() throws Exception {  
        LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();  
        validator.setValidationMessageSource(getMessageSource());  
        return validator;  
    }  
}
