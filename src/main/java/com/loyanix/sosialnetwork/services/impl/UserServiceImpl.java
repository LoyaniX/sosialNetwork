package com.loyanix.sosialnetwork.services.impl;

import com.loyanix.sosialnetwork.enums.Relationship;
import com.loyanix.sosialnetwork.enums.Sex;
import com.loyanix.sosialnetwork.models.User;
import com.loyanix.sosialnetwork.repositories.UserRepository;
import com.loyanix.sosialnetwork.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public User getUserById(Long id) {
        return repository.getUserById(id);
    }

    @Override
    public User createUser(User user) {
        return repository.save(user);
    }

    @Override
    public User updateUser(Long id, User user) {
        User userToUpdate = repository.getUserById(id);

        userToUpdate.setUserName(user.getUserName());
        userToUpdate.setFirstName(user.getFirstName());
        userToUpdate.setLastName(user.getLastName());
        userToUpdate.setAvatar(user.getAvatar());
        userToUpdate.setCoverPictures(user.getCoverPictures());
        userToUpdate.setAbout(user.getAbout());
        userToUpdate.setGeo(user.getGeo());
        userToUpdate.setWorksAt(user.getWorksAt());
        userToUpdate.setSex(user.getSex());
        userToUpdate.setAge(user.getAge());
        userToUpdate.setRelationship(user.getRelationship());

        return repository.save(userToUpdate);
    }
}
