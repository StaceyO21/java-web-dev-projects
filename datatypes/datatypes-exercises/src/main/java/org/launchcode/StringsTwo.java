package org.launchcode;

import java.util.Scanner;

public class StringsTwo {
    public static void main(String[] args){

        String str = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, ‘and what is the use of a book,’" +
                " thought Alice ‘without pictures or conversation?";

        int index = str.indexOf("pictures");
        System.out.println("pictures is at index=" + index);
        String searchTerm = "pictures";
        int length = searchTerm.length();
        System.out.println("Your search term is " + length + " characters long.");
        str = str.replace("pictures", "");
        System.out.println(str);
    }
}
