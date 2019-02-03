package org.sid.fidecoin.security;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JWTAutorizationFilter extends OncePerRequestFilter {


    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {

        System.out.println("************************************");
        /*

       */
      String jwt = httpServletRequest.getHeader("Authorization");
      if(jwt==null) throw new RuntimeException("not Authorized !");
      /*

       */

      filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}
