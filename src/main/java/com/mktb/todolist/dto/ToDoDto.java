package com.mktb.todolist.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * @author yeganeh
 * @created 11/12/2022 - 3:55 PM
 */


@AllArgsConstructor
@NoArgsConstructor
public class ToDoDto {
    private Integer id;

    private Date dueDate;

    private Date createdDate;

    private Date updateDate;

    private String title;

    private String description;

    private boolean checked;


    public Integer getId() {
        return id;
    }

    public ToDoDto setId(Integer id) {
        this.id = id;
        return this;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public ToDoDto setDueDate(Date dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public ToDoDto setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public ToDoDto setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ToDoDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ToDoDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public boolean isChecked() {
        return checked;
    }

    public ToDoDto setChecked(boolean checked) {
        this.checked = checked;
        return this;
    }
}
