package org.launchcode;
import java.util.Scanner;

public class NumericTypes2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven:");
        Double miles = input.nextDouble();

        System.out.println("How much gas was used in gallons:");
        Double gallons = input.nextDouble();

        Double mpg = miles / gallons;
        System.out.println("You are running on " + mpg + "mpg.");
    }
}
