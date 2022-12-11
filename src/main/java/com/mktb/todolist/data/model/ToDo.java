package com.mktb.todolist.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

/**
 * @author yeganeh
 * @created 11/12/2022 - 2:12 PM
 */

@Entity
@AllArgsConstructor
@NoArgsConstructor

public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public ToDo setId(Integer id) {
        this.id = id;
        return this;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public ToDo setDueDate(Date dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public ToDo setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public ToDo setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ToDo setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ToDo setDescription(String description) {
        this.description = description;
        return this;
    }

    public boolean isChecked() {
        return checked;
    }

    public ToDo setChecked(boolean checked) {
        this.checked = checked;
        return this;
    }
}
