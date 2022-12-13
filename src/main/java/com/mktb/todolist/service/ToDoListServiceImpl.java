package com.mktb.todolist.service;

import com.mktb.todolist.data.model.ToDo;
import com.mktb.todolist.data.repository.ToDoRepository;
import com.mktb.todolist.dto.ToDoDto;
import com.mktb.todolist.exceptions.ToDoException;
import com.mktb.todolist.service.mapper.ToDoMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author yeganeh
 * @created 11/12/2022 - 3:13 PM
 */
@Service
public class ToDoListServiceImpl implements ToDoListService {
    private final ToDoRepository toDoRepository;
    private final ToDoMapper toDoMapper;

    public ToDoListServiceImpl(ToDoRepository toDoRepository, ToDoMapper toDoMapper) {
        this.toDoRepository = toDoRepository;
        this.toDoMapper = toDoMapper;
    }

    @Override
    public List<ToDoDto> getAllToDoList() {
        List<ToDo> todolist = toDoRepository.findAll();
        return todolist.stream().map(todo -> toDoMapper.toDoToToDoDto(todo)).collect(Collectors.toList());

    }

    @Override
    public void createToDo(ToDoDto toDoDto) {
        toDoRepository.save(toDoMapper.toDoDtoToToDo(toDoDto));
    }

    @Override
    public ToDoDto updateToDo(ToDoDto toDoDto) throws Exception {
        ToDo findById = findById(toDoDto.getId());
        ToDo toDoInput = toDoMapper.toDoDtoToToDo(toDoDto);
        ToDo toDoUpdated = toDoRepository.save(toDoInput);

        return toDoMapper.toDoToToDoDto(toDoUpdated);
    }

    @Override
    public void deleteToDo(Integer id) throws Exception {
        ToDo byId = findById(id);
        toDoRepository.delete(byId);
    }


    private ToDo findById(Integer id) throws Exception {
        Optional<ToDo> todo = toDoRepository.findById(id);
        if (todo.isPresent()) {
            return todo.get();
        } else throw new ToDoException("Todo not found");
    }
}
