package com.sha.springbootseller.util;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

public class SecurityUtils {
    public static final String Role_PREFİX = "ROLE_";
    public static final String AUTH_HEADER="authorization";
    public static final String AUTH_TOKEN_TYPE = "Bearer";
    public static final String AUTH_TOKEN_PREFIX = AUTH_TOKEN_TYPE + " ";

    public static SimpleGrantedAuthority convertToAuthority(String role){
        String formattedRole = role.startsWith(Role_PREFİX) ? role : Role_PREFİX + role;

        return new SimpleGrantedAuthority(formattedRole);
    }

    public static String extraxtAuthTokenFromRequest(HttpServletRequest request){
        String bearerToken = request.getHeader(AUTH_HEADER);

        if (StringUtils.hasLength(bearerToken) && bearerToken.startsWith(AUTH_TOKEN_PREFIX)){
            return bearerToken.substring(7);
        }
        return null;
    }
}
