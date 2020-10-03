package com.example.rupkothargolpo.Adapters;

import java.io.Serializable;

public class Paragraph implements Serializable {
    private int images;
    private String title;
    private String details;

    public Paragraph() {
    }

    public Paragraph(int images, String title, String details) {
        this.images = images;
        this.title = title;
        this.details = details;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

}
