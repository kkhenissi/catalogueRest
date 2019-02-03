package org.sid.fidecoin.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends  WebSecurityConfigurerAdapter {





    @Override
    protected void configure(HttpSecurity http) throws Exception {
      //  super.configure(http);
        http.csrf().disable();
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.authorizeRequests().antMatchers("/categories/**").hasRole("ADMIN");
        http.authorizeRequests().antMatchers("/produits/**").hasRole(("USER"));
        http.authorizeRequests().anyRequest().authenticated();
        http.addFilterBefore(new JWTAutorizationFilter(), UsernamePasswordAuthenticationFilter.class);
    }


    //    @Autowired
//    private UserDetailsService userDetailsService;
//    // Authorization : AppRole -> Access
//    protected  void configure(HttpSecurity http) throws  Exception
//    {
//        http
//
//               .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                .and()
//                   .authorizeRequests()
//                     .antMatchers("/user/**", "/login/**")
//                        .permitAll()
//                          .antMatchers(HttpMethod.POST, "/adminProd/**")
//                                 .hasRole("ADMIN")
//                                  .anyRequest().authenticated()
//                .and()
//               //   .addFilter(new JWTAuthenticationFilter(authenticationManager()))
//                  //  .addFilterBefore(new JWTAuthorizationFilter(),
//                            UsernamePasswordAuthenticationFilter.class);
//                // .antMatchers("/**")
//                                    //     .hasRole("ADMIN").and()
//                                          //    .csrf().disable().headers().frameOptions().disable();
//
//    }
//
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService).passwordEncoder(
//                NoOpPasswordEncoder.getInstance());
//
//
//
//    }


}
