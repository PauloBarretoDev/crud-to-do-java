package com.example.demo;

public class Task {
    public int id;
    public String description;
    public boolean done;

    public Task(int id, String description, boolean done){
        this.id = id;
        this.description = description;
        this.done = done;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setId(int id) {
        this.id = id;
    }
}
