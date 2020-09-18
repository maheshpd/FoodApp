package com.createsapp.foodapp.model;

public class BestForYou {

    String name;
    Integer rating;
    String time;
    String price;

    public BestForYou(String name, Integer rating, String time, String price) {
        this.name = name;
        this.rating = rating;
        this.time = time;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
