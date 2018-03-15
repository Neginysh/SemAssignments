package com.example.lenovocom.thirdsemapp;

/**
 * Created by lenovo.com on 3/15/2018.
 */

public class HotelModel {
    String name;
    int star;
    int distanceToCenter;
    String imgURL;
    int imgResource;
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public int getDistanceToCenter() {
        return distanceToCenter;
    }

    public void setDistanceToCenter(int distanceToCenter) {
        this.distanceToCenter = distanceToCenter;
    }

    public String getImgURL() {
        return imgURL;
    }

  
    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public int getImgResource() {
        return imgResource;
    }

    public void setImgResource(int imgResource) {
        this.imgResource = imgResource;
    }
}
