package com.example.cityguidedashboard.helperclasses.homeadapter;


public class MostViewedHelperClass {

    int image;
    String title, description;
    float rating;

    public MostViewedHelperClass(int image, String title,float rating, String description) {
        this.image = image;
        this.title = title;
        this.rating = rating;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public  float getRating() {
        return rating;
    }

    public String getDescription() {
        return description;
    }


}

