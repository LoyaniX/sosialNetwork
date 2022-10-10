package com.loyanix.sosialnetwork.repositories;

import com.loyanix.sosialnetwork.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
