package com.loyanix.sosialnetwork.repositories;

import com.loyanix.sosialnetwork.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends MongoRepository<User, String> {
    public User getUserById(Long id);

    public User getUserByUserName(String userName);
}
