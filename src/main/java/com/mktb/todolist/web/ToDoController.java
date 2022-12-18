package com.mktb.todolist.web;

import com.mktb.todolist.dto.Response;
import com.mktb.todolist.dto.ToDoDto;
import com.mktb.todolist.service.ToDoListService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author yeganeh
 * @created 11/12/2022 - 3:01 PM
 */

@RestController
@CrossOrigin
public class ToDoController {

    private ToDoListService toDoListService;

    public ToDoController(ToDoListService toDoListService) {
        this.toDoListService = toDoListService;
    }

    @GetMapping("/all" )
    public ResponseEntity<Object> getAllToDoList(){
        return new ResponseEntity<>(toDoListService.getAllToDoList(), HttpStatus.OK) ;
    }

    @PostMapping("/create")
    public void createToDo(@RequestBody ToDoDto toDoDto){
        toDoListService.createToDo(toDoDto);
    }

    @PutMapping("/update")
    public ToDoDto updateToDo(@RequestBody ToDoDto toDoDto) throws Exception {
        return toDoListService.updateToDo(toDoDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteToDo(@PathVariable Integer id) throws Exception {
        toDoListService.deleteToDo(id);
    }


}
