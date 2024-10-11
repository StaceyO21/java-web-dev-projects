package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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
//        test isNew()
//        this.dateAdded = LocalDate.parse("2022-06-12");
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
//    custom toString() method
@Override
public String toString(){
        String newText = isNew() ? " - New!" : "";
        return description + newText + "\n" + price;
}

    public void setPrice(double price) {
        this.price = price;
    }

    boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysBetween = getDateAdded().until(today, ChronoUnit.DAYS);
        return  daysBetween < 90;

    }
}
