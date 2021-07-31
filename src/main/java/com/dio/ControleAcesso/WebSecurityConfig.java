package com.dio.ControleAcesso;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {       // -> Segurança esta Desabilitada



    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable()// -> DESABILITAR EM CASO DE TRABALHO COM JSON
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS) // -> Desabilita sessão
                .and()
                    .authorizeRequests()
                    .antMatchers("/","/**").permitAll()  // -> permitida a todos
                    .anyRequest().authenticated();
    }


    @Override
    public void configure(WebSecurity web) {  // -> pastas liberadas
        web
                .ignoring()
                .antMatchers("/h2/**"); // -> Liberado acesso ao banco H2 console
    }






}
