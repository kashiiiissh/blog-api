package com.blogapi.blog_api.service;

import com.blogapi.blog_api.model.dto.*;
import com.blogapi.blog_api.model.entity.*;
import com.blogapi.blog_api.repository.*;
import com.blogapi.blog_api.exception.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepo;
    private final CategoryRepository catRepo;

    

    public Page<PostResponse> getAll(Pageable pageable) {
    return postRepo.findAll(pageable).map(this::map);
}

    public PostResponse getById(Long id) {
        return map(postRepo.findById(id).orElseThrow());
    }

    public PostResponse create(PostRequest req) {
        Category cat = catRepo.findById(req.getCategoryId()).orElseThrow();

        Post p = new Post();
        p.setTitle(req.getTitle());
        p.setContent(req.getContent());
        p.setAuthor(req.getAuthor());
        p.setCategory(cat);
        p.setCreatedAt(LocalDateTime.now());
        p.setUpdatedAt(LocalDateTime.now());

        return map(postRepo.save(p));
    }

    public PostResponse update(Long id, PostRequest req) {
        Post p = postRepo.findById(id).orElseThrow();

        p.setTitle(req.getTitle());
        p.setContent(req.getContent());
        p.setAuthor(req.getAuthor());
        p.setUpdatedAt(LocalDateTime.now());

        return map(postRepo.save(p));
    }

    public void delete(Long id) {
        postRepo.deleteById(id);
    }

    private PostResponse map(Post p) {
        return PostResponse.builder()
                .id(p.getId())
                .title(p.getTitle())
                .content(p.getContent())
                .author(p.getAuthor())
                .categoryId(p.getCategory().getId())
                .categoryName(p.getCategory().getName())
                .createdAt(p.getCreatedAt())
                .updatedAt(p.getUpdatedAt())
                .build();
    }
}