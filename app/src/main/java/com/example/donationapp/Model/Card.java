package com.example.donationapp.Model;

import java.util.ArrayList;

public class Card extends ArrayList<Card> {
    public String Title,TargetPrice,TargetPercent;
    public int image;
    public int Flag;
    public int SliderPercent;

    public Card(String title, String targetPrice, String targetPercent, int image, int flag, int sliderPercent) {
        Title = title;
        TargetPrice = targetPrice;
        TargetPercent = targetPercent;
        this.image = image;
        Flag = flag;
        SliderPercent = sliderPercent;
    }

    public Card(String title, String targetPrice, String targetPercent, int image, int flag) {
        Title = title;
        TargetPrice = targetPrice;
        TargetPercent = targetPercent;
        this.image = image;
        this.Flag = flag;
    }

    public Card(String title, String targetPrice, int image, int flag) {
        Title = title;
        TargetPrice = targetPrice;
        this.image = image;
        this.Flag = flag;
    }

    public String getTitle() {
        return Title;
    }

    public String getTargetPrice() {
        return TargetPrice;
    }

    public String getTargetPercent() {
        return TargetPercent;
    }

    public int getImage() {
        return image;
    }

    public int getFlag() {
        return Flag;
    }

    public int getSliderPercent() {
        return SliderPercent;
    }
}
