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

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
