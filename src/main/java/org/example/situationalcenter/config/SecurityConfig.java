//package org.example.situationalcenter.config;
//
//import jakarta.servlet.http.HttpServletResponse;
//import org.example.situationalcenter.repository.UserRepository;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
//
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//        private final UserRepository userRepository;
//        private final JwtTokenFilter jwtTokenFilter;
//
//    public SecurityConfig(UserRepository userRepository,
//                JwtTokenFilter jwtTokenFilter) {
//            this.userRepository = userRepository;
//            this.jwtTokenFilter = jwtTokenFilter;
//        }
//
//        // Details omitted for brevity
//
//        @Override
//        protected void configure(HttpSecurity http) throws Exception {
//            // Enable CORS and disable CSRF
//            http = http.cors().and().csrf().disable();
//
//            // Set session management to stateless
//            http = http
//                    .sessionManagement()
//                    .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                    .and();
//
//            // Set unauthorized requests exception handler
//            http = http
//                    .exceptionHandling()
//                    .authenticationEntryPoint(
//                            (request, response, ex) -> {
//                                response.sendError(
//                                        HttpServletResponse.SC_UNAUTHORIZED,
//                                        ex.getMessage()
//                                );
//                            }
//                    )
//                    .and();
//
//            // Set permissions on endpoints
//            http.authorizeRequests()
//                    // Our public endpoints
//                    .antMatchers("/api/public/**").permitAll()
//                    .antMatchers(HttpMethod.GET, "/api/author/**").permitAll()
//                    .antMatchers(HttpMethod.POST, "/api/author/search").permitAll()
//                    .antMatchers(HttpMethod.GET, "/api/book/**").permitAll()
//                    .antMatchers(HttpMethod.POST, "/api/book/search").permitAll()
//                    // Our private endpoints
//                    .anyRequest().authenticated();
//
//            // Add JWT token filter
//            http.addFilterBefore(
//                    jwtTokenFilter,
//                    UsernamePasswordAuthenticationFilter.class
//            );
//        }
//
//        // Used by Spring Security if CORS is enabled.
//        @Bean
//        public CorsFilter corsFilter() {
//            UrlBasedCorsConfigurationSource source =
//                    new UrlBasedCorsConfigurationSource();
//            CorsConfiguration config = new CorsConfiguration();
//            config.setAllowCredentials(true);
//            config.addAllowedOrigin("*");
//            config.addAllowedHeader("*");
//            config.addAllowedMethod("*");
//            source.registerCorsConfiguration("/**", config);
//            return new CorsFilter(source);
//        }
//
//    }
////    @Bean
////    public InMemoryUserDetailsManager userDetailsService() {//burada role lere icaze verilecek
////        // InMemoryUserDetailsManager (see below)
////    }
//
////    @Bean
////    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {// endpointlere icazeler burdan verilecek
////        // http builder configurations for authorize requests and form login (see below)
////    }
//}
