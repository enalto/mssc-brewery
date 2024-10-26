package com.enalto.springfranework.msscbrewery.web.controller;


import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class MvcExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<List<String>> validationErrorHandle(ConstraintViolationException exception) {
        ArrayList<String> erros = new ArrayList<>(exception.getConstraintViolations().size());

        exception.getConstraintViolations().forEach(violation -> {
            erros.add(violation.getPropertyPath() + " : " + violation.getMessage());
        });
        return new ResponseEntity<>(erros, HttpStatus.BAD_REQUEST);
    }

}
