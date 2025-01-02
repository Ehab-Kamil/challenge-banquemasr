package com.banquemisr.challenge05.security;

import com.banquemisr.challenge05.security.model.AuthRequest;
import com.banquemisr.challenge05.security.model.AuthUser;
import com.banquemisr.challenge05.security.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * Title: AuthController.java
 * </p>
 *
 * <p>
 * Description:
 * </p>
 *
 * <p>
 * Copyright: Copyright(c) Ehab Kamil, 2025
 * </p>
 *
 * @author <a href="mailto:ehabkamil2@gmail.com">Ehab Attia</a>
 * @version 1.0
 * @date 02/01/2025
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtUtil jwtUtil;

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody AuthRequest authRequest) {
		Authentication authentication = authenticationManager
						.authenticate(new UsernamePasswordAuthenticationToken(
								authRequest.getUsername(),
								authRequest.getPassword()));
		SecurityContextHolder.getContext().setAuthentication(authentication);

		AuthUser userDetails = (AuthUser) authentication.getPrincipal();


		String token = jwtUtil.generateToken(authentication);

		return ResponseEntity.ok(token);
	}
}

