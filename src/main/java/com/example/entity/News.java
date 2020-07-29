package com.example.entity;

public class News {

    private int id;
    private String newName;
    private String newContent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public String getNewContent() {
        return newContent;
    }

    public void setNewContent(String newContent) {
        this.newContent = newContent;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", newName='" + newName + '\'' +
                ", newContent='" + newContent + '\'' +
                '}';
    }
}

