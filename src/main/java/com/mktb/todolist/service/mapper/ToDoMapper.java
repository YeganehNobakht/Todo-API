package com.mktb.todolist.service.mapper;

import com.mktb.todolist.data.model.ToDo;
import com.mktb.todolist.dto.ToDoDto;
import org.springframework.stereotype.Component;

/**
 * @author yeganeh
 * @created 11/12/2022 - 3:57 PM
 */
@Component
public class ToDoMapper {

    public ToDoDto toDoToToDoDto (ToDo toDo){
        return new ToDoDto()
                .setChecked(toDo.isChecked())
                .setCreatedDate(toDo.getCreatedDate())
                .setDescription(toDo.getDescription())
                .setDueDate(toDo.getDueDate())
                .setId(toDo.getId())
                .setTitle(toDo.getTitle())
                .setUpdateDate(toDo.getUpdateDate())
                ;
    }

     public ToDo toDoDtoToToDo (ToDoDto toDoDto){
        return new ToDo()
                .setChecked(toDoDto.isChecked())
                .setCreatedDate(toDoDto.getCreatedDate())
                .setDescription(toDoDto.getDescription())
                .setDueDate(toDoDto.getDueDate())
                .setId(toDoDto.getId())
                .setTitle(toDoDto.getTitle())
                .setUpdateDate(toDoDto.getUpdateDate())
                ;
    }


}
