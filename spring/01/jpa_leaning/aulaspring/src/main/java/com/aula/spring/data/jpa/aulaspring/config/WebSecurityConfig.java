package com.aula.spring.data.jpa.aulaspring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  @Autowired
  private SecurityDatabaseService securityService;

  @Autowired
  public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
      auth.userDetailsService(securityService).passwordEncoder(NoOpPasswordEncoder.getInstance());
  }


  
	// @Override
  // protected void configure(AuthenticationManagerBuilder auth) throws Exception {
  // auth.inMemoryAuthentication()
  //             .withUser("user")
  //             .password("{noop}root")
  //             .roles("USERS")
  //             .and()
  //             .withUser("admin")
  //             .password("{noop}admin")
  //             .roles("MANAGERS");
  //   }

    /*
     * Este trecho foi apresentado no curso porém o próprio VSCODE me apresentou o Lambda usado abaixo e funcionou perfeitamente igual!
     */
    // @Override
    // protected void configure(HttpSecurity http) throws Exception {
    //   http.authorizeRequests()
    //     .antMatchers("/").permitAll()
    //     .antMatchers("/login").permitAll()
    //     .antMatchers("/managers").hasAnyRole("MANAGERS")
    //     .antMatchers("/user").hasAnyRole("USERS", "MANAGERS")
    //     // .anyRequest().authenticated().and().formLogin();
    //     .anyRequest().authenticated().and().httpBasic();
    // } 

  @Override
  protected void configure(HttpSecurity http) throws Exception {
      http.authorizeRequests(requests -> requests
              .antMatchers("/").permitAll()
              .antMatchers("/login").permitAll()
              .antMatchers("/managers").hasAnyRole("MANAGERS")
              .antMatchers("/user").hasAnyRole("USERS", "MANAGERS")
              // .anyRequest().authenticated().and().formLogin();
              .anyRequest().authenticated()).httpBasic(withDefaults());
  } 

  // @Override
  // protected void configure(HttpSecurity http) throws Exception {
  //     http.authorizeRequests(requests -> requests
  //             .antMatchers("/").permitAll()
  //             .antMatchers(HttpMethod.POST, "/login").permitAll()
  //             .antMatchers("/managers").hasAnyRole("MANAGERS")
  //             .antMatchers("/user").hasAnyRole("USERS", "MANAGERS")
  //             .anyRequest().authenticated()).formLogin(withDefaults());
  // }
}
