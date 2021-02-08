package com.homework.three;

import java.util.Scanner;

public class Isnegative {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("Your number is greater than zero");
        } else if (number < 0) {
            System.out.println("Your number is less then zero");
        } else {
            System.out.println("You, cheater, number is zero");
        }
    }
}
