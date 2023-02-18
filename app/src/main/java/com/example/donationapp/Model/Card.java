package com.example.donationapp.Model;

public class Card {
    private String Title,TargetPrice,TargetPercent;
    private int image;
    private int Flag;
    private int SliderPercent;

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
