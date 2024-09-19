package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven: ");
        Double miles = input.nextDouble();
        System.out.println("How many gallons did you use: ");
        Double gallons = input.nextDouble();
        input.close();

        Double milesPerGallon = (miles / gallons);
        System.out.println("Your miles-per-gallons are: "+ milesPerGallon +"!");
    }
}
