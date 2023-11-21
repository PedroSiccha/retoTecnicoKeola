/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author Pedro
 */
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final AuthenticationManager authenticationManager;

    public JwtAuthenticationFilter(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain
    ) throws ServletException, IOException {
        try {
            // Extraer el token JWT del encabezado de autorización
            String jwtToken = extractJwtToken(request.getHeader("Authorization"));

            if (jwtToken != null && isValidToken(jwtToken)) {
                // Validar el token y configurar la autenticación en el contexto de seguridad
                Authentication authentication = authenticate(jwtToken);
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }

        } catch (Exception e) {
            logger.error("Error al procesar la autenticación JWT", e);
        }

        // Continuar con la cadena de filtros
        filterChain.doFilter(request, response);
    }

    private String extractJwtToken(String authorizationHeader) {
        // Extraer y devolver el token JWT del encabezado de autorización
        // Aquí implementa la lógica para obtener el token de Authorization
        // Asegúrate de manejar casos como "Bearer <token>"
    }

    private boolean isValidToken(String jwtToken) {
        // Implementar la lógica para validar la firma y la validez del token
    }

    private Authentication authenticate(String jwtToken) {
        // Obtener el usuario desde el token y configurar la autenticación
        // Aquí, debes recuperar el usuario y los roles desde el token y devolver una instancia de UsernamePasswordAuthenticationToken

        // Ejemplo:
        // String username = extractUsernameFromToken(jwtToken);
        // List<GrantedAuthority> authorities = extractAuthoritiesFromToken(jwtToken);
        // return new UsernamePasswordAuthenticationToken(username, null, authorities);

        // Asegúrate de que la instancia de Authentication contenga la información necesaria sobre el usuario autenticado
    }

    // Métodos adicionales para extraer información del token si es necesario

    @Override
    protected void doFilterInternal(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response, jakarta.servlet.FilterChain filterChain) throws jakarta.servlet.ServletException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
