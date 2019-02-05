package org.sid.fidecoin.security;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JWTAutorizationFilter extends OncePerRequestFilter {


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

      String jwt = request.getHeader("Authorization");
//      if(jwt==null) throw new RuntimeException("not Authorized !");
      /*

       */

     filterChain.doFilter(request, response);
    }
}
