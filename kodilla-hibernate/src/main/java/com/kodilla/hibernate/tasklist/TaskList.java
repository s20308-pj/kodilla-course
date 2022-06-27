package com.kodilla.hibernate.tasklist;



import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TASKLIST")
public class TaskList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "ID")
    private long id;

    @Column(name = "LISTNAME")
    private String listName;

    @NotNull
    @Column(name = "DESCRIPTION")
    private String description;

    public TaskList() {
    }

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    private  void setId(long id) {
        this.id = id;
    }

    public String getListName() {
        return listName;
    }

    private void setListName(String listName) {
        this.listName = listName;
    }


    public String getDescription() {
        return description;
    }

    private  void setDescription(String description) {
        this.description = description;
    }
}
