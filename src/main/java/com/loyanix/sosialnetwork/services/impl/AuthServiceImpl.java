package com.loyanix.sosialnetwork.services.impl;

import com.loyanix.sosialnetwork.exceptions.AccessDeniedException;
import com.loyanix.sosialnetwork.models.User;
import com.loyanix.sosialnetwork.repositories.UserRepository;
import com.loyanix.sosialnetwork.requests.LoginUserRequest;
import com.loyanix.sosialnetwork.requests.RegisterUserRequest;
import com.loyanix.sosialnetwork.services.AuthService;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    @Autowired
    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User registerUser(RegisterUserRequest registerUserRequest) {
        User creationUser = new User();

        String salt = BCrypt.gensalt();
        String hashedPassword = BCrypt.hashpw(registerUserRequest.getPassword(), BCrypt.gensalt());

        creationUser.setUserName(registerUserRequest.getUserName());
        creationUser.setFirstName(registerUserRequest.getFirstName());
        creationUser.setLastName(registerUserRequest.getLastName());
        creationUser.setPassword(hashedPassword);

        creationUser = userRepository.save(creationUser);

        return creationUser;
    }

    @Override
    public User loginUser(LoginUserRequest loginUserRequest) throws AccessDeniedException {
        User user = userRepository.getUserByUserName(loginUserRequest.getUserName());

        if (user != null && BCrypt.checkpw(loginUserRequest.getPassword(), user.getPassword())) {
            return user;
        } else {
            throw new AccessDeniedException("User not found");
        }
    }
}
