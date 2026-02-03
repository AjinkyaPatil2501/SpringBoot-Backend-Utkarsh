//package com.utkarsh.core.config;
//
//import java.io.IOException;
//import java.util.Collections;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.Cookie;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//@Component
//public class JwtFilter extends OncePerRequestFilter {
//
//    @Autowired
//    private JwtUtil jwtUtil;
//
//    // ✅ Skip JWT for auth APIs & preflight
////    @Override
////    protected boolean shouldNotFilter(HttpServletRequest request) {
////        String path = request.getRequestURI();
////        return request.getMethod().equalsIgnoreCase("OPTIONS")
////                || path.startsWith("/auth/v1/");
////    }
//    @Override
//    protected boolean shouldNotFilter(HttpServletRequest request) {
//        String path = request.getRequestURI();
//
//        return request.getMethod().equalsIgnoreCase("OPTIONS")
//            || path.startsWith("/auth/v1/")
//            || (path.equals("/users/v1/register") && request.getMethod().equals("POST"));
//    }
//
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request,
//                                    HttpServletResponse response,
//                                    FilterChain filterChain)
//            throws ServletException, IOException {
//
//        String token = null;
//
//        // ✅ Read JWT from HttpOnly cookie
//        Cookie[] cookies = request.getCookies();
//        if (cookies != null) {
//            for (Cookie cookie : cookies) {
//                if ("authToken".equals(cookie.getName())) {
//                    token = cookie.getValue();
//                    System.out.println("Received authToken cookie: " + token);
//                    break;
//                }
//            }
//        }
//
//        // ✅ Validate token
//        if (token != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//            try {
//                if (jwtUtil.validateToken(token)) {
//
//                    String username = jwtUtil.extractUsername(token);
//                    String role = jwtUtil.extractRole(token);
//
//                    UsernamePasswordAuthenticationToken authToken =
//                            new UsernamePasswordAuthenticationToken(
//                                    username,
//                                    null,
//                                    Collections.singleton(new SimpleGrantedAuthority(role))
//                            );
//
//                    SecurityContextHolder.getContext().setAuthentication(authToken);
//                }
//            } catch (Exception e) {
//                response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//                return;
//            }
//        }
//
//        filterChain.doFilter(request, response);
//    }
//}

//==============================================================================

package com.utkarsh.core.config;

import java.io.IOException;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtFilter extends OncePerRequestFilter {

	@Autowired
	private JwtUtil jwtUtil;

	@Override
//	protected boolean shouldNotFilter(HttpServletRequest request) {
//		String path = request.getRequestURI();
//		return request.getMethod().equalsIgnoreCase("OPTIONS") || path.startsWith("/auth/v1/") // login/logout public
//				|| (path.equals("/users/v1/register") && request.getMethod().equals("POST"))
//				|| (path.equals("/users/v1/update") && request.getMethod().equals("PATCH"))
//				|| (path.equals("/customers/v1/create/company") && request.getMethod().equals("POST"))
//				|| (path.equals("/customers/v1/create/individual") && request.getMethod().equals("POST"))
//				|| (path.equals("/customers/v1/personaldetails") && request.getMethod().equals("GET"))
//				|| (path.equals("/customers/v1/kyc") && request.getMethod().equals("DELETE"))
//				|| (path.equals("/customers/v1/search") && request.getMethod().equals("GET"))
//				|| (path.equals("/deposite/v1/alldetails") && request.getMethod().equals("GET"));
//
//	}
//	protected boolean shouldNotFilter(HttpServletRequest request) {
//	    String path = request.getRequestURI();
//
//	    return request.getMethod().equalsIgnoreCase("OPTIONS")
//	        || path.startsWith("/auth/v1/")
//	        || path.startsWith("/users/v1/register")
//	        || path.startsWith("/customers/v1/")
//	        || path.startsWith("/deposite/v1/");
//	}
	protected boolean shouldNotFilter(HttpServletRequest request) {
	    String path = request.getRequestURI();
	    String contextPath = request.getContextPath(); // e.g., "/utkarsh"
	    String relativePath = path.substring(contextPath.length());

	    return request.getMethod().equalsIgnoreCase("OPTIONS")
	        || relativePath.startsWith("/auth/v1/")
	        || relativePath.startsWith("/users/v1/register")
	        || relativePath.startsWith("/customers/v1/")
	        || relativePath.startsWith("/deposite/v1/");
	    
	}


	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		String token = null;
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if ("authToken".equals(cookie.getName())) {
					token = cookie.getValue();
					break;
				}
			}
		}

		if (token != null && SecurityContextHolder.getContext().getAuthentication() == null) {
			try {
				if (jwtUtil.validateToken(token)) {
					String username = jwtUtil.extractUsername(token);
					String role = jwtUtil.extractRole(token);

					UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(username,
							null, Collections.singleton(new SimpleGrantedAuthority(role)));

					SecurityContextHolder.getContext().setAuthentication(authToken);
				}
			} catch (Exception e) {
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				return;
			}
		}

		filterChain.doFilter(request, response);
	}
}
