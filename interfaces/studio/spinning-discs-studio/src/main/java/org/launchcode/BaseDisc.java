package org.launchcode;

import java.time.LocalDate;
import java.util.Date;

public abstract class BaseDisc {
    private String spinDirection;
    private Double spinSpeed;
    private String mediaData;
    private String mediaName;
    private Double mediaLength;
    private String mediaReleaseDate;

    public BaseDisc(String spinDirection, Double spinSpeed, String mediaData, String mediaName, Double mediaLength, String mediaReleaseDate) {
        this.spinDirection = spinDirection;
        this.spinSpeed = spinSpeed;
        this.mediaData = mediaData;
        this.mediaName = mediaName;
        this.mediaLength = mediaLength;
        this.mediaReleaseDate = mediaReleaseDate;
    }

    public String getSpinDirection() {
        return spinDirection;
    }

    public void setSpinDirection(java.lang.String spinDirection) {
        this.spinDirection = spinDirection;
    }

    public Double getSpinSpeed() {
        return spinSpeed;
    }

    public void setSpinSpeed(Double spinSpeed) {
        this.spinSpeed = spinSpeed;
    }

    public void setMediaData(String mediaData) {
        this.mediaData = mediaData;
    }

    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }

    public void setMediaLength(Double mediaLength) {
        this.mediaLength = mediaLength;
    }

    public void setMediaReleaseDate(String mediaReleaseDate) {
        this.mediaReleaseDate = mediaReleaseDate;
    }

    public String getMediaData() {
        return mediaData;
    }

    public String getMediaName() {
        return mediaName;
    }

    public Double getMediaLength() {
        return mediaLength;
    }

    public String getMediaReleaseDate() {
        return mediaReleaseDate;
    }


    public void storeData(String mediaData){
        System.out.println("Data stored Successfully: " + mediaData);
    };
    public void infoReport(){
        System.out.println("Information Report: " +
                "Name: "+ this.mediaName + " Length: "+this.mediaLength+ " Release Date: "+ this.mediaReleaseDate);
    };

}