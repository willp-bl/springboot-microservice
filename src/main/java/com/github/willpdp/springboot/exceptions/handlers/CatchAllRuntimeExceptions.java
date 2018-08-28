package com.github.willpdp.springboot.exceptions.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.text.MessageFormat;

@ControllerAdvice
public class CatchAllRuntimeExceptions {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleException(RuntimeException e) {
        return new ResponseEntity<>(MessageFormat.format("error! {0}", e.getClass().getName()), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
