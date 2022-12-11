package com.mktb.todolist.data.repository;

import com.mktb.todolist.data.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author yeganeh
 * @created 11/12/2022 - 3:00 PM
 */
@Repository
public interface ToDoRepository extends JpaRepository<ToDo,Integer> {
}
