package com.cognizant.springlearn.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {

    private static final SecretKey KEY =
            Keys.hmacShaKeyFor("mysupersecretkeymysupersecretkey12".getBytes());

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(
            @RequestHeader("Authorization") String authHeader) {

        String user = getUser(authHeader);

        String token = generateJwt(user);

        Map<String, String> map = new HashMap<>();

        map.put("token", token);

        return map;
    }

    private String getUser(String authHeader) {

        String encoded = authHeader.substring(6);

        byte[] decoded = Base64.getDecoder().decode(encoded);

        String credentials = new String(decoded, StandardCharsets.UTF_8);

        return credentials.split(":")[0];
    }

    private String generateJwt(String user) {

        return Jwts.builder()
                .subject(user)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 1200000))
                .signWith(KEY, SignatureAlgorithm.HS256)
                .compact();

    }

}