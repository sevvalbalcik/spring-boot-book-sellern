package com.sha.springbootseller.service;

import com.sha.springbootseller.model.User;

public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
