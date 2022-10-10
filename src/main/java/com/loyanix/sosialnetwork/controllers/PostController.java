package com.loyanix.sosialnetwork.controllers;

import com.loyanix.sosialnetwork.models.Post;
import com.loyanix.sosialnetwork.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/post")
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/{id}")
    public Post getPost(@PathVariable Long id) {
        return null;
    }

    /*@PutMapping("/{id}")
    public ResponseEntity updatePost(@PathVariable Long id, @RequestBody Post post) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletePost(@PathVariable Long id, @RequestBody Post post) {
        return null;
    }

    @PostMapping
    public ResponseEntity createPost(@RequestBody Post user) {
        return null;
    }

    @PostMapping("/{id}")
    public ResponseEntity likePost(@PathVariable Long id, @RequestBody Post post) {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity getTimelinePosts(@PathVariable Long id) {
        return null;
    }
     */
}
