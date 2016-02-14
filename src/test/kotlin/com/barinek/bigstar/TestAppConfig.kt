package com.barinek.bigstar

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer
import org.springframework.core.io.ClassPathResource

@Configuration()
open class TestAppConfig {
    @Profile("test")
    @Bean
    open fun propertySourcesPlaceholderConfigurer(): PropertySourcesPlaceholderConfigurer {
        val configurer = PropertySourcesPlaceholderConfigurer()
        configurer.setLocations(ClassPathResource("test.properties"))
        return configurer
    }
}