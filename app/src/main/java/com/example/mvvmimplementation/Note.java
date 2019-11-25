package com.example.mvvmimplementation;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity
public class Note {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String table;
    private String description;
    private int priority;

    public Note(String table, String description, int priority) {
        this.table = table;
        this.description = description;
        this.priority = priority;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTable() {
        return table;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}
