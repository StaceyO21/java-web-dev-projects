package org.launchcode;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;


    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    //    custom toString()
    @Override
    public String toString() {
        StringBuilder smallPlate = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("smallPlate")) {
                smallPlate.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder mainCourses = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("main course")) {
                mainCourses.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder dessert = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("dessert")) {
                dessert.append("\n").append(item.toString()).append("\n");
            }
        }
        return "\nSammi's Menu\n" +
                "Small Plate" + smallPlate.toString() + "\n" +
                "Main Course" + mainCourses.toString() + "\n" +
                "Dessert" + dessert.toString() + "\n";

        void addItem(MenuItem newItem) {
            menuItems.add(newItem);
            lastUpdated = LocalDate.now();
        }
        void removeItem(MenuItem item) {
            menuItems.remove(item);
            lastUpdated = LocalDate.now();
        }
    }

