package com.loyanix.sosialnetwork.services;

import com.loyanix.sosialnetwork.exceptions.AccessDeniedException;
import com.loyanix.sosialnetwork.models.User;
import com.loyanix.sosialnetwork.requests.LoginUserRequest;
import com.loyanix.sosialnetwork.requests.RegisterUserRequest;

public interface AuthService {

    public User registerUser(RegisterUserRequest registerUserRequest);

    public User loginUser(LoginUserRequest loginUserRequest) throws AccessDeniedException;
}
