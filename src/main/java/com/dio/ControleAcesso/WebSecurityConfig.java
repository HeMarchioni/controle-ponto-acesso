package com.dio.ControleAcesso;



import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;



@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {



    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                    .authorizeRequests()
                    .antMatchers("/","/**").permitAll()  // -> permitida a todos
                    .anyRequest().authenticated();
    }


    @Override
    public void configure(WebSecurity web) {  // -> pastas liberadas
        web
                .ignoring()
                .antMatchers("/h2/**");
    }






}
