package BuyingOfGoodies.E_commerecApplication.config;

import BuyingOfGoodies.E_commerecApplication.service.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.ModelMapper.modelMapper;

@Configuration
@EnableWebSecurity
public class SecurityConfig {



        @Autowired
        private UserServiceImpl userServiceImpl;

        @Bean
        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
            http
                    .csrf().disable()
                    .authorizeHttpRequests(auth -> auth
                            .requestMatchers("/api/auth/**").permitAll()
                            .anyRequest().authenticated())
                    .httpBasic();

            return http.build();
        }

        @Bean
        public PasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();
        }


        @Bean
        public ModelMapper modelMapper() {
            return new ModelMapper();

    }

        @Bean
        public AuthenticationManager authManager(HttpSecurity http) throws Exception {
            return http.getSharedObject( AuthenticationManagerBuilder.class)
                    .userDetailsService(userService)
                    .passwordEncoder(passwordEncoder())
                    .and().build();
        }
    }


