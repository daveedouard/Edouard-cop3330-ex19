/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex19;

import java.util.Scanner;

public class exercise19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Height: ");
        double height = input.nextDouble();
        System.out.print("Weight: ");
        double weight = input.nextDouble();

        double bmi = (weight/(height*height))*703;
        System.out.print("Your bmi is "+String.format("%.1f",bmi)+"\n");

        if(bmi<18.5){
            System.out.println("You are underweight.");
        }
        else if(bmi>=18.5 && bmi<=25){
            System.out.println("You are within the ideal weight.");
        }
        else if(bmi>25){
            System.out.println("You are overweight. You should see a doctor.");
        }
    }
}
