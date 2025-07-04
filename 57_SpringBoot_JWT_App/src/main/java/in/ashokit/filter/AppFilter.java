package in.ashokit.filter;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import in.ashokit.service.JwtService;
import in.ashokit.service.MyUserDetailsService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class AppFilter extends OncePerRequestFilter {

	 	@Autowired
	    private JwtService jwtService;

	    @Autowired
	    MyUserDetailsService userDetailsServiceImpl;

	    @Override
	    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
	    	
	        String authHeader = request.getHeader("Authorization");// check Authorization header presence
	        String token = null;
	        String username = null;
	        
	        if(authHeader != null && authHeader.startsWith("Bearer")){// if header present,retrieve bearer token
	            token = authHeader.substring(7);
	            username = jwtService.extractUsername(token);
	        }

	        if(username != null && SecurityContextHolder.getContext().getAuthentication() == null){ // validate token
	            UserDetails userDetails = userDetailsServiceImpl.loadUserByUsername(username);
	            if(jwtService.validateToken(token, userDetails)){   // if token is valid,update security context
	                UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
	                authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
	                SecurityContextHolder.getContext().setAuthentication(authenticationToken);
	            }
	        }
	        filterChain.doFilter(request, response);
	    }
}
