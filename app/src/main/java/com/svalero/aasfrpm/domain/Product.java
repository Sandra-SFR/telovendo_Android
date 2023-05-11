package com.svalero.aasfrpm.domain;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Product {

    //TODO cuando este la api, cambiar los campos en consecuencia

    @PrimaryKey
    @NonNull
    private String name;
    @ColumnInfo
    private String category;
    @ColumnInfo
    private double price;
    @ColumnInfo
    private boolean available;
    @ColumnInfo
    private double latitude;
    @ColumnInfo
    private double longitude;
    @ColumnInfo
    private String user_user;


    public Product() {}

    public Product(String name, String category, double price, boolean available, double latitude, double longitude, String user_user) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.available = available;
        this.latitude = latitude;
        this.longitude = longitude;
        this.user_user = user_user;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUser_user() {
        return user_user;
    }

    public void setUser_user(String user_user) {
        this.user_user = user_user;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}