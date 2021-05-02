package com.sodatech.services.vat.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * The {@link WebSecurityConfig} class configures security related aspects of our REST application.
 * The configuration is mainly used to "secure" spring rest service endpoints.
 *
 * @author jp
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * Authentication Whitelist.
     */
    private static final String[] AUTH_WHITELIST = {
            "**/swagger-resources/**",
            "**/swagger-ui.html",
            "**/swagger-ui.html/**",
            "**/v2/api-docs",
            "**/webjars/**"
    };
//    /**
//     * Access point header invoked when an illegal access occurs.
//     */
//    private final IllegalAccessEntryPointHandler unauthorizedHandler;
//
//    /**
//     * Constructor.
//     *
//     * @param illegalAccessEntryPointHandler Access point header invoked when an illegal access occurs.
//     */
//    @Autowired
//    WebSecurityConfig(final IllegalAccessEntryPointHandler illegalAccessEntryPointHandler) {
//        this.unauthorizedHandler = illegalAccessEntryPointHandler;
//    }

    /**
     * Configures the {@link AuthenticationManager}.
     *
     * @return AuthenticationManager
     * @throws Exception if the authentication manager could not be wired.
     */
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    /**
     * Configures the user detail service for use by spring security.
     *
     * @param authenticationManagerBuilder injected authentication manager build allowing for the setting of the user detail service.
     * @throws Exception if the authentication manager builder could not wire the user detail service into the authentication of the system.
     */
    @Autowired
    public void configureAuthentication(final AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.userDetailsService(new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                return null;
            }
        });
    }

    /**
     * Configures the security of our rest application.
     *
     * @param httpSecurity {@link HttpSecurity} which is injected and used for configuring the security-related aspects of the rest application.
     * @throws Exception if the security sub-system could not be configured.
     */
    @Override
    protected void configure(final HttpSecurity httpSecurity) throws Exception {
        httpSecurity.cors().and().csrf().disable().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().exceptionHandling()
                .and()
                .authorizeRequests().antMatchers(HttpMethod.GET, "/*.html").permitAll()
                .antMatchers(HttpMethod.GET, "/css/**").permitAll()
                .antMatchers(HttpMethod.GET, "/js/**").permitAll()
                //
                // Secure all admin services with ROLE_ADMIN
                //
                .antMatchers("/**").permitAll()

                .antMatchers("/error/**").permitAll()
                .antMatchers(AUTH_WHITELIST).permitAll()
                .antMatchers("/v3/api-docs",
                        "/v3/api-docs/**",
                        "/swagger-ui.html",
                        "/swagger-ui/**",
                        "/swagger-resources",
                        "/swagger-resources/configuration/ui",
                        "/swagger-resources/configuration/security").permitAll()
                .antMatchers("**/swagger-ui.html", "/swagger-resources/**", "/webjars/**", "/configuration/**", "/v2/**").permitAll()
                .antMatchers("/actuator/**").permitAll()
                .antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
                .antMatchers("/auth/**").permitAll().anyRequest()
                .authenticated().and().authorizeRequests();

        // Custom JWT based authentication
    }
}
