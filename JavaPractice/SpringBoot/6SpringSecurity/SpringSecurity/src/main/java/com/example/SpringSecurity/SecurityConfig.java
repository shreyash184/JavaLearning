package com.example.SpringSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private AppUserService appUserService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("shreyash").password("$2a$10$kKGERe5FjTqn7CsSw/sK6.vEuCTcZIwH7j1p2s1LjzQAkLGS.lP8a")
//                .roles("admin", "user")
//                .and().withUser("moti").password("$2a$10$kKGERe5FjTqn7CsSw/sK6.vEuCTcZIwH7j1p2s1LjzQAkLGS.lP8a")
//                .roles("user");
        auth.userDetailsService(appUserService);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){

        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests().antMatchers("/hello/*").hasAuthority("user")
                        .antMatchers("/product/*").hasAuthority("admin");
        http.formLogin();
        http.httpBasic();
    }
//    For Every run you will get the different hashcode, So please copy new code everytime you run the application

    public static void main(String[] args) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encoded = passwordEncoder.encode("1234");
        System.out.println(encoded);
    }
}
