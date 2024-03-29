package com.rader.algafood.core.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure (HttpSecurity http)throws Exception {
        http.httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers("/swagger-ui/**").permitAll()
                .anyRequest().authenticated();

    }
}
