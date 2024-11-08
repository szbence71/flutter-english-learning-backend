package com.flutter.english.learning.webapp.backend.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((authz) -> authz
                        .anyRequest().permitAll());
        return http.build();
    }

    // TODO következő requesteket is hozzáadni........
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring()
                .requestMatchers("/login", "/register", "/logout", "/achievements", "/achievement/validate", "/userachievements", "/getusergamescount", "/getallquiz", 
                    "/getallwords", "/getuserwordstranslated", "/getallhardwords", "/getallhardquiz", "/getuserhardgamescount", "/getuserscore")
                .anyRequest();
    }
}