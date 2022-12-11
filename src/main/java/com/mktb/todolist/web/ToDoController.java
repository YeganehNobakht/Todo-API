package com.mktb.todolist.web;

import com.mktb.todolist.dto.Response;
import com.mktb.todolist.service.ToDoListService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yeganeh
 * @created 11/12/2022 - 3:01 PM
 */

@RestController
public class ToDoController {
    private ToDoListService toDoListService;

    public ToDoController(ToDoListService toDoListService) {
        this.toDoListService = toDoListService;
    }

    @GetMapping("all" )
    public ResponseEntity<Object> getAllToDoList(){
        return new ResponseEntity<>(toDoListService.getAllToDoList(), HttpStatus.OK) ;
    }
}
