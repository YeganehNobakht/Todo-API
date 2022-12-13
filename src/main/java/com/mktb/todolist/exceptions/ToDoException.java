package com.mktb.todolist.exceptions;

/**
 * @author yeganeh
 * @created 12/12/2022 - 1:58 PM
 */
public class ToDoException extends Exception{
    private Integer errorCode;
    private String message;

    public ToDoException(String message) {
        this.message = message;
    }
}
