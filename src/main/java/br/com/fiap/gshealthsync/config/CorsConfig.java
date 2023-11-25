package br.com.fiap.gshealthsync.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();

        // Permitir solicitações de uma origem específica
        config.setAllowCredentials(true);
        config.addAllowedOrigin("https://snack.expo.dev/@cecilianeves/healthsync-gs"); // ou use config.addAllowedOriginPattern("https://snack-web-player.s3.us-west-1.amazonaws.com")

        // Permitir métodos especificados (GET, POST, etc.)
        config.addAllowedMethod("*");

        // Permitir headers específicos (pode ser personalizado conforme necessário)
        config.addAllowedHeader("*");

        source.registerCorsConfiguration("/**", config);

        return new CorsFilter(source);
    }
}

