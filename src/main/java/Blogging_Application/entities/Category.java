package Blogging_Application.entities;

import javax.persistence.*;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    // 🔥 ADD THIS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // optional (for title)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}