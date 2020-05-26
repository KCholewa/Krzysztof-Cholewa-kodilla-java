package com.kodilla.hibernate.tasklist;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TASKLIST")
public class TaskList {
    private int id;
    private String listName;
    private String descrption;

    public TaskList(){
    }

    public TaskList(String listName, String descrption) {
        this.listName = listName;
        this.descrption = descrption;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "LISTNAME")
    public String getListName() {
        return listName;
    }

    @NotNull
    @Column(name = "DESCRIPTION")
    public String getDescrption() {
        return descrption;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setListName(String listName) {
        this.listName = listName;
    }

    private void setDescrption(String descrption) {
        this.descrption = descrption;
    }
}
