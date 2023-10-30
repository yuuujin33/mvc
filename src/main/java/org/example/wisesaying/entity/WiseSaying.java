package org.example.wisesaying.entity;

import lombok.Getter;
import lombok.Setter;

public class WiseSaying {
    private long id;
    private  String content;
    private  String author;
    public WiseSaying(long id, String content, String author) {
        this.id = id;
        this.content= content;
        this.author = author;
    }
    public long getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
