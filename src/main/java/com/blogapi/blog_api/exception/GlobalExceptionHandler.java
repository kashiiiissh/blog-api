package com.blogapi.blog_api.exception;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
public ResponseEntity<?> handleAll(Exception ex) {
    return ResponseEntity.status(500)
            .body(Map.of("error", ex.getMessage()));
}
}