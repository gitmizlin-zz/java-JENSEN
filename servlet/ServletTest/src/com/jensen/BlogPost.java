package com.jensen;

import java.util.Date;


public class BlogPost {

    private String header;
    private String author;
    private Date date;
    private String post;

    public BlogPost(String header, String author, Date date, String post) {
        this.header = header;
        this.author = author;
        this.date = date;
        this.post = post;
    }

    public String getHeader() {
        return header;
    }

    public String getAuthor() {
        return author;
    }

    public Date getDate() {
        return date;
    }

    public String getPost() {
        return post;
    }
}