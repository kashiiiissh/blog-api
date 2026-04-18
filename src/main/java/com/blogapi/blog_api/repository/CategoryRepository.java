package com.blogapi.blog_api.repository;

import com.blogapi.blog_api.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
