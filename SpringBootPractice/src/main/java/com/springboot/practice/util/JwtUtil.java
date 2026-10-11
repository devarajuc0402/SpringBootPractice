package com.springboot.practice.util;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtil {

	@Value("${jwt.secret.key}")
	static String SECRET_KEY;
	
	// Generate JWT token
	public static String generateToken(String password) {
		
		return Jwts.builder()
				.setSubject(password)
				.setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
				.signWith(SignatureAlgorithm.HS256, SECRET_KEY)
				.compact();
	}
	
	// Validate and extract password
	public static String extractPassword(String token) {
		
		return Jwts.parser()
				.setSigningKey(SECRET_KEY)
				.parseClaimsJws(token)
				.getBody()
				.getSubject();
	}
}
