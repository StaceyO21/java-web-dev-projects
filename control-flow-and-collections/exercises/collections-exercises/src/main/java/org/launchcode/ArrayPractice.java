package org.launchcode;

import java.util.Arrays;



public class ArrayPractice {
    public static void main(String[] args) {

        //Create and initialize array
        int[] integerArray = {1, 1, 2, 3, 5, 8};

        //loop through array print out values
         for (int value : integerArray) {
          System.out.println(value);
   }
        //only print odd numbers
        for (int j : integerArray) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not " +
                "eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));

        String[] arrOfStr = phrase.split("\\.");
        System.out.println(Arrays.toString(arrOfStr));

    }

}
