package com.mktb.todolist.service;

import com.mktb.todolist.dto.ToDoDto;

import java.util.List;

/**
 * @author yeganeh
 * @created 11/12/2022 - 3:13 PM
 */
public interface ToDoListService {
    List<ToDoDto> getAllToDoList();

    void createToDo(ToDoDto toDoDto);

    ToDoDto updateToDo(ToDoDto toDoDto) throws Exception;

    void deleteToDo(Integer id) throws Exception;
}
