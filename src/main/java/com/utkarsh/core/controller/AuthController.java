package com.utkarsh.core.controller;

import com.utkarsh.core.config.JwtUtil;
import com.utkarsh.core.dto.LoginRequestDto;
import com.utkarsh.core.dto.LoginResponseDto;
import com.utkarsh.core.model.User;
import com.utkarsh.core.service.AuthService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth/v1")
public class AuthController {

    @Autowired private AuthService authservice;
    @Autowired private JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginRequestDto login,
                                       HttpServletResponse response,
                                       HttpServletRequest request) {
        User user = authservice.getUserDetails(login);
        if (user == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Credentials");
        }

        String token = jwtUtil.generateToken(user.getCuserId().toString(), "ROLE_USER");

        if (user.getDeviceId() == null) {
            user.setDeviceId(login.getDeviceId());
            authservice.updateDeviceId(user.getCuserId(), login.getDeviceId());
        } else if (!user.getDeviceId().equals(login.getDeviceId())) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Login blocked: This account is locked to another device.");
        }

        Cookie cookie = new Cookie("authToken", token);
        cookie.setHttpOnly(true);
        cookie.setSecure(false);
        cookie.setPath("/");
        cookie.setMaxAge(24 * 60 * 60);
        response.addCookie(cookie);
        
   

        

        LoginResponseDto dto = new LoginResponseDto();
        dto.setUserId(user.getCuserId());
        dto.setUserName(user.getCuserName());
        dto.setBankId(user.getCbankId());
        dto.setBranchId(user.getCbranId());
        dto.setPhoto(user.getPhoto());
        dto.setCuserStat(user.getCuserStat());
        return ResponseEntity.ok(dto);
    }

    
    @GetMapping("/lang")
    public ResponseEntity<String> getLanguage()
    {
    	String lang = authservice.getLanguage();
    	return ResponseEntity.ok(lang);
    }
    
    @PostMapping("/logout")
    public ResponseEntity<?> logoutUser(HttpServletResponse response,
                                        HttpServletRequest request) {
        Cookie cookie = new Cookie("authToken", null);
        cookie.setHttpOnly(true);
        cookie.setSecure(false);
        cookie.setPath("/");
        cookie.setMaxAge(0);
        response.addCookie(cookie);

        return ResponseEntity.ok("Logged out successfully");
    }

    @GetMapping("/me")
    public ResponseEntity<?> getLoggedInUser(HttpServletRequest request) {

        String token = null;

        if (request.getCookies() != null) {
            for (Cookie cookie : request.getCookies()) {
                if ("authToken".equals(cookie.getName())) {
                    token = cookie.getValue();
                    break;
                }
            }
        }

        if (token == null || !jwtUtil.validateToken(token)) {  
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        String userId = jwtUtil.extractUsername(token);
        User user = authservice.findByUserId(userId);
        if (user == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        LoginResponseDto dto = new LoginResponseDto();
        dto.setUserId(user.getCuserId());
        dto.setUserName(user.getCuserName());
        dto.setBankId(user.getCbankId());
        dto.setBranchId(user.getCbranId());
        dto.setPhoto(user.getPhoto());
        dto.setCuserStat(user.getCuserStat());
        return ResponseEntity.ok(dto);
    }
    
    
}
