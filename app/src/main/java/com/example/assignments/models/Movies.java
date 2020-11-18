package com.example.assignments.models;

public class Movies {
    String name;
    String rating;
    String detail;
    String image;
    public Movies(String name, String rating, String detail, String image) {
        this.name = name;
        this.rating = rating;
        this.detail = detail;
        this.image = image;
    }
    public String getName() {
        return name;
    }
    public void getName(String name) {
        this.name = name;
    }
    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }
    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
}
