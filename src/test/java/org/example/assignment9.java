/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Tony Tang
 */

package org.example;
import java.util.Scanner;
import java.lang.*;

public class assignment9 {

    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length and width of the ceiling: ");

        float length = scan.nextFloat();
        float width = scan.nextFloat();

        float area = length * width;

        int result = (int) Math.ceil(area / 350);
        System.out.println("You will need to purchase "+result+" gallons of paint to cover "+area+" square feet");
    }
}