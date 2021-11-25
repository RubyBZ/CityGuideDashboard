package com.example.cityguidedashboard.helperclasses.homeadapter;

public class FeaturedHelperClass {

    int image;
    String title, rating, description;

    public FeaturedHelperClass(int image, String title,String rating, String description) {
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

    public  String getRating() {
        return description;
    }

    public String getDescription() {
        return description;
    }


}
