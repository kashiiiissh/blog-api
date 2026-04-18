package com.blogapi.blog_api.controller;

import com.blogapi.blog_api.model.entity.Comment;
import com.blogapi.blog_api.model.entity.Post;
import com.blogapi.blog_api.repository.CommentRepository;
import com.blogapi.blog_api.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentRepository commentRepo;
    private final PostRepository postRepo;

    @GetMapping("/api/posts/{postId}/comments")
    public List<Comment> getComments(@PathVariable Long postId) {
        return commentRepo.findByPostId(postId);
    }

    @PostMapping("/api/posts/{postId}/comments")
    public Comment add(@PathVariable Long postId, @RequestBody Comment c) {
        Post post = postRepo.findById(postId).orElseThrow();
        c.setPost(post);
        return commentRepo.save(c);
    }

    @DeleteMapping("/api/comments/{id}")
    public String delete(@PathVariable Long id) {
        commentRepo.deleteById(id);
        return "Deleted";
    }
}