package org.launchcode;

import java.time.LocalDate;
import java.util.Date;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private final LocalDate dateAdded;

    public MenuItem(String description, double price, String category) {
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = LocalDate.now();
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getDescription(){
        return this.description;
    }

    public Double getPrice(){
        return this.price;
    }

    public String getCategory(){
        return this.category;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }
}
