package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;


public class Array_List_Practice {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();

        for (int index = 0; index < 10; index++){
            arr.add(index);
        }
        System.out.println(sumEven(arr));

        ArrayList <String> str = new ArrayList<>();
        String[] word = {"apple", "banana", "pears", "oranges"};

        ArrayList <String> stringArrayList = new ArrayList<>(Arrays.asList(word));

         fiveLetters(stringArrayList);
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

    public static void fiveLetters(ArrayList<String> stringArray) {

     for (String string : stringArray) {
         if (string.length() == 5) {
             System.out.println(string);
         }
     }
    }
}
