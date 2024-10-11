package org.launchcode;

public class Main {

    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Dal", 30, "Main Course");
        MenuItem item2 = new MenuItem("English Toffee", 15, "Dessert");
        MenuItem item3 = new MenuItem("Fried Plantains", 18, "Small Plate");
        MenuItem item4 = new MenuItem("Veggie Pizza", 20, "Main Course");
        MenuItem item5 = new MenuItem("Breadsticks", 14, "Small Plate");

        System.out.println(item1.isNew());

        System.out.println(item1);
    }
}
