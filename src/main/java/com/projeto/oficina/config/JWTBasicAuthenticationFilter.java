package com.projeto.oficina.config;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

public class JWTBasicAuthenticationFilter extends BasicAuthenticationFilter {

//	@Autowired
//	private UsuariosService usuariosService;
//
//	@Autowired
//	private UsuariosRepository usuariosRepository;

	public JWTBasicAuthenticationFilter(AuthenticationManager authenticationManager) {
		super(authenticationManager);
	}

	@Override
	protected void doFilterInternal(HttpServletRequest httpRequest, HttpServletResponse httpResponse, FilterChain chain)
			throws IOException, ServletException {

		String headerAuthentication = httpRequest.getHeader("Authorization");

		if (headerAuthentication == null) {
			chain.doFilter(httpRequest, httpResponse);
			return;
		}

		try {

			String[] valuesHeaderAuthentication = headerAuthentication.split(" ");
			String jwt = valuesHeaderAuthentication[1];

			DecodedJWT decodedJwt = JWT.require(Algorithm.HMAC256("ChaveTokenT2MSkill")).build().verify(jwt);

			String login = decodedJwt.getClaim("login").asString();
			String role = decodedJwt.getClaim("role").asString();
//			Usuarios usuario = usuariosService.findByUsername(login);
//
//			if (usuariosRepository.existsByUsuariosNomeUsuario(login)
//					&& usuariosRepository.findByusuariosNomeUsuario(login).getUsuariosTipo().equalsIgnoreCase(role)
//					&& usuariosRepository.findByusuariosNomeUsuario(login).getUsuariosAtivo()) {
//				List<GrantedAuthority> authorities = Arrays
//						.asList(new SimpleGrantedAuthority(usuario.getUsuariosTipo()));
//				UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(login,
//						null, authorities);
//				SecurityContextHolder.getContext().setAuthentication(authentication);
//
//				chain.doFilter(httpRequest, httpResponse);
//			}
//
//			else {
//
//				httpResponse.sendError(HttpStatus.UNAUTHORIZED.value());
//				return;
//
//			}

		} catch (JWTVerificationException ex) {
			httpResponse.sendError(HttpStatus.UNAUTHORIZED.value());
			return;
		}

	}

}
