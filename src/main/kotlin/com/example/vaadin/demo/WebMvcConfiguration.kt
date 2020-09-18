package com.example.vaadin.demo

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Lazy
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

/**
 * Created by masc on 19.09.2020.
 */
@Configuration
@Lazy(false)
@EnableWebMvc
class WebConfiguration : WebMvcConfigurer {
    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        super.addResourceHandlers(registry.apply {
            // resource handler for images
            addResourceHandler("/img/**")
                    .addResourceLocations("classpath:/img/")
        });
    }
}