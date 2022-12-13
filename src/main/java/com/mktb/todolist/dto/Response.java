package com.mktb.todolist.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yeganeh
 * @created 11/12/2022 - 3:11 PM
 */
@NoArgsConstructor
public class Response {
    private String errorDescription;

    public Response(String errorDescription) {
        this.errorDescription = errorDescription;
    }



    public String getErrorDescription() {
        return errorDescription;
    }

    public Response setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
        return this;
    }
}
