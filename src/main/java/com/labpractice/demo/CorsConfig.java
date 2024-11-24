package com.labpractice.demo;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import jakarta.servlet.http.HttpServletRequest;

@Component
public class CorsConfig implements CorsConfigurationSource{
    @Override
    public CorsConfiguration getCorsConfiguration(HttpServletRequest arg0) {
        
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowedOrigins(List.of("null", null, "http://localhost:8080/index.html"));
        corsConfiguration.setAllowedMethods(List.of("*"));
        corsConfiguration.setAllowedHeaders(List.of("*"));
        return corsConfiguration;
    }
}