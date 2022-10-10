package com.loyanix.sosialnetwork.services;

import com.loyanix.sosialnetwork.models.User;

public interface UserService {
    public User getUserById(Long id);
    public User createUser(User user);
    public User updateUser(Long id, User user);
}
