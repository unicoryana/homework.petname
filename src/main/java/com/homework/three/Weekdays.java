package com.homework.three;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number: ");
        int day = input.nextInt();

        System.out.println("Your input number is: " + day + ". This is " + getDayName(day));
    }
    public static String getDayName(int day) {
        String dayName = "";
        switch (day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tue"; break;
            case 3: dayName = "Wen"; break;
            case 4: dayName = "Thu"; break;
            case 5: dayName = "Fri"; break;
            case 6: dayName = "Sun"; break;
            case 7: dayName = "Sat"; break;
            default: dayName = "Invalid day"; break;
        }
        return dayName;
    }
}
