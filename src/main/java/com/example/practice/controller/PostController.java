package com.example.practice.controller;

import com.example.practice.domain.Post;
import com.example.practice.repository.PostRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @PostMapping

    public Post createPost(
            @RequestBody String content) {
        Post post = new Post();
        post.setContent(content);
        return postRepository.save(post);
    }

    @GetMapping("/{id}")
    public Optional<Post> getPost(
            @PathVariable Long id) {
        return postRepository.findById(id);
    }
}
