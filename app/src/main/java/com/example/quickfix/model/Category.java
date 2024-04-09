package com.example.quickfix.model;

public class Category {


    Integer id;

    String name;
    Integer imageurl;

    public Category(Integer id, String name, Integer imageurl) {
        this.id = id;
        this.name = name;
        this.imageurl = imageurl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {return name;}

    public Integer getImageurl() {
        return imageurl;
    }

    public void setImageurl(Integer imageurl) {
        this.imageurl = imageurl;
    }


    public String getCategoryName() {return name;}
}
