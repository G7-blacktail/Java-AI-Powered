package dio.spring.jwt.leaning.leaning_jwt.security;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.CorsConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.h2.server.web.WebServlet;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter  {

    @Bean
    public BCryptPasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

    private static final String[] SWAGGER_WHITELIST = {
        "/v2/api-docs",
        "/swagger-resources",
        "/swagger-resources/**",
        "/configuration/ui",
        "/configuration/security",
        "/swagger-ui.html",
        "/webjars/**"
    };

    //versão passada no curso
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.headers().frameOptions().disable();
        http.cors().and().csrf().disable()
            .addFilterAfter(new JWTFilter(), UsernamePasswordAuthenticationFilter.class)
            .authorizeRequests()
            .antMatchers(SWAGGER_WHITELIST).permitAll()
            .antMatchers("/h2-console/**").permitAll()
            .antMatchers(HttpMethod.POST, "/login").permitAll()
            .antMatchers(HttpMethod.POST, "/users").hasAnyRole("USERS", "MANAGERS")
            .antMatchers(HttpMethod.GET, "/users").hasAnyRole("USERS", "MANAGERS")
            .antMatchers("/managers").hasAnyRole("MANAGERS")
            .anyRequest().authenticated()
            .and()
            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }

    //versão com Lambda
    // @Override
    // protected void configure(HttpSecurity http) throws Exception {
    //     http.headers().frameOptions().disable();
    //     http.cors(withDefaults()).csrf(csrf -> csrf.disable())
    //             .addFilterAfter(new JWTFilter(), UsernamePasswordAuthenticationFilter.class)
    //             .authorizeRequests(requests -> requests
    //                     .antMatchers(SWAGGER_WHITELIST).permitAll()
    //                     .antMatchers("/h2-console/**").permitAll()
    //                     .antMatchers(HttpMethod.POST, "/login").permitAll()

    //                     .antMatchers(HttpMethod.POST, "/users").hasAnyRole("USERS", "MANAGERS")
    //                     .antMatchers(HttpMethod.GET, "/users").hasAnyRole("USERS", "MANAGERS")
    //                     .antMatchers("/managers").hasAnyRole("MANAGERS")

    //             .anyRequest().authenticated())
    //             .sessionManagement(management -> management.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
    // }

    // private Customizer<CorsConfigurer<HttpSecurity>> withDefaults() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'withDefaults'");
    // }

    @Bean //HABILITANDO ACESSAR O H2-DATABSE NA WEB
    public ServletRegistrationBean h2servletRegistration(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet());
        registrationBean.addUrlMappings("/h2-console/*");
        return registrationBean;
    }
    
}
