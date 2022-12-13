package com.mktb.todolist.exceptions;

import com.mktb.todolist.dto.Response;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author yeganeh
 * @created 12/12/2022 - 1:59 PM
 */
@RestControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler({ToDoException.class,Exception.class})
    public Response didehBankExceptionExceptionHandler(Exception e) {
        return new Response(e.getMessage());
    }
}
