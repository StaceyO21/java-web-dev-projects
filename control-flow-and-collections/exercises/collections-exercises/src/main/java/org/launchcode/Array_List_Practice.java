package org.launchcode;

import java.util.ArrayList;



public class Array_List_Practice {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();

        for (int index = 0; index < 10; index++){
            arr.add(index);
        }
        System.out.println(sumEven(arr));

        ArrayList <String> str = new ArrayList<>();
        str.add("apple");
        str.add("banana");
        str.add("pears");
        str.add("oranges");
        str.add("grapes");

        System.out.println(fiveLetters(str));
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static <str> void fiveLetters(ArrayList<String> str) {

        for (int i = 0; i < 5; i++) {
            String word = str[i];
            if (str[i].size() == 5) {
                System.out.println(i);
            }

        }
    }
}
