package com.vincent.gestiondestock.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
      http
              .authorizeRequests()
              .antMatchers("dashboard").authenticated()
              .antMatchers("/home").permitAll()
              .and()
              .formLogin()
              .hashCode()
      //Hashcode à la place de httpBasic() ??
              ;
    }
}
