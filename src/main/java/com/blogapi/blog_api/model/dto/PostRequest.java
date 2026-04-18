package com.blogapi.blog_api.model.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PostRequest {
    @NotNull
    private String title;

    @NotNull
    private String content;

    @NotNull
    private String author;

    @NotNull
    private Long categoryId;
}