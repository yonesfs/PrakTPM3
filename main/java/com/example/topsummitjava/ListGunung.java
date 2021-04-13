package com.example.topsummitjava;

public class ListGunung {
    private int image;
    private String name;
    private String summary;

    public ListGunung() {
        this.image   = image;
        this.name    = name;
        this.summary = summary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSummary() {
        return summary;
    }

    public void setImage(int image) {
        this.image = image;
    }
    public int getImage() {
        return image;
    }

}