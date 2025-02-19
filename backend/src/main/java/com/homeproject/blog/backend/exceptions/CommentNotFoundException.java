package com.homeproject.blog.backend.exceptions;

import org.springframework.http.HttpStatus;

public class CommentNotFoundException extends BlogException {

    public CommentNotFoundException() {
        super("The comment wasn't found");
        setCode("404");
        setHttpStatus(HttpStatus.NOT_FOUND);
    }
}
