package com.mktb.todolist.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yeganeh
 * @created 11/12/2022 - 3:11 PM
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Response {
    private Integer errorCode;
    private String errorDescription;
}
