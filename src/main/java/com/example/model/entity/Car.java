package com.example.model.entity;

import java.time.LocalDate;


public class Car {
    private String model;
    private String branch;
    private Integer year;
    private Double price;
    private Integer numberStars;

    public Car(String model, String branch, Integer year, Double price, Integer numberStars) {
        this.model=model;
        this.branch = branch;
        this.year = year;
        this.price = price;
        this.numberStars = numberStars;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNumberStars() {
        return numberStars;
    }

    public void setNumberStars(Integer numberStars) {
        this.numberStars = numberStars;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", branch='" + branch + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", numberStars=" + numberStars +
                '}';
    }
}
