package com.guillermo.bancoazteca.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            // 🔓 Desactiva CSRF (evita bloqueos de POST, PUT, DELETE)
            .csrf(csrf -> csrf.disable())

            // 🔓 Permite todas las peticiones (modo desarrollo)
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll()
            )

            // 🔓 Desactiva autenticación (para pruebas sin credenciales)
            .httpBasic(basic -> basic.disable())
            .formLogin(login -> login.disable());

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
