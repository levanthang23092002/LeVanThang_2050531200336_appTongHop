package com.example.user;

import java.io.Serializable;

public class item_game implements Serializable {
    private int image,image_rate;

    private String name,year,type,amount,amount_rate,ratio;

    public item_game(int image, String name, String year, String type, String amount, String amount_rate, String ratio,int image_rate) {
        this.image = image;
        this.name = name;
        this.year = year;
        this.type = type;
        this.amount = amount;
        this.amount_rate = amount_rate;
        this.ratio = ratio;
        this.image_rate=image_rate;
    }

    public int getImage_rate() {
        return image_rate;
    }

    public void setImage_rate(int image) {
        this.image = image;
    }
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount_rate() {
        return amount_rate;
    }

    public void setAmount_rate(String amount_rate) {
        this.amount_rate = amount_rate;
    }

    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }
}
