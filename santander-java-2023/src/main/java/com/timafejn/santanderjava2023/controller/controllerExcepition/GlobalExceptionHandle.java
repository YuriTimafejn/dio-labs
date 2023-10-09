package com.timafejn.santanderjava2023.controller.controllerExcepition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class GlobalExceptionHandle {

    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandle.class);

    @ExceptionHandler(IllegalAccessException.class)
    public ResponseEntity<String> handle(IllegalAccessException exception)
    {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> notFound(NoSuchElementException exception)
    {
        return new ResponseEntity<>("Element not found", null, 404);
    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> unespected(Throwable exception)
    {
        logger.error("Unespected server error", exception);
        return new ResponseEntity<>("Unespected server error", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
