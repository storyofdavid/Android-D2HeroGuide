package com.gamestudi.d2heroguide.NeutralsScreens;


public class Item {
    private int image;
    private String title;
    private String description;
    private String steps;



    public void setImage(int image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getSteps() {
        return steps;
    }
}
