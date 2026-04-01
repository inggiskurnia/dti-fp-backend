package com.warehub.warehub.infrastructure.config;



import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import java.util.List;

public class CorsConfigurationSourceImpl implements CorsConfigurationSource {


    @Override
    public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowedHeaders(List.of("Authorization", "Cache-Control", "Content-Type", "Application"));
        corsConfiguration.setAllowedOrigins(List.of(
                "https://warehub.iktrisiawan.com",
                "http://localhost:3001",
                "http://localhost:3000",
                "http://0.0.0.0:3000",
                "http://host.docker.internal:3000",
                "https://warehubbb.vercel.app"
        ));
        corsConfiguration.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.setExposedHeaders(List.of("Authorization"));

        return corsConfiguration;
    }
}
