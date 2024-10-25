package com.example.final30daysrecipeapp;

public class Recipe {
    private final String dayTitle;
    private final String headerText;
    private final String descriptionText;
    private final int imageResId;

    public Recipe(String dayTitle, String headerText, String descriptionText, int imageResId) {
        this.dayTitle = dayTitle;
        this.headerText = headerText;
        this.descriptionText = descriptionText;
        this.imageResId = imageResId;
    }

    public String getDayTitle() { return dayTitle; }
    public String getHeaderText() { return headerText; }
    public String getDescriptionText() { return descriptionText; }
    public int getImageResId() { return imageResId; }
}
