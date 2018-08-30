package ua.dragun.library.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="library")
public class Book {
    private String id;
    private String author;
    private String title;
    private String description;
    private Integer year;

    public Book() {
    }

    public Book(String id, String author, String title, String description, Integer year) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.description = description;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
