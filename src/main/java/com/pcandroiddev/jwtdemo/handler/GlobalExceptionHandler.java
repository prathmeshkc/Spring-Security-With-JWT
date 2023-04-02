package com.pcandroiddev.jwtdemo.handler;

import com.pcandroiddev.jwtdemo.model.exceptions.ExceptionBody;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<?> handleException(DataIntegrityViolationException exception) {
        return ResponseEntity.badRequest().body(new ExceptionBody(exception.getMessage()));
    }



}
