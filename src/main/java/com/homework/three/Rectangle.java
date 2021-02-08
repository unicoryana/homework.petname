package com.homework.three;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input rectangle width");
        int width = input.nextInt();

        System.out.println("Input rectangle height");
        int height = input.nextInt();

        rectanglecalc(width, height);
    }

    public static void rectanglecalc(int width, int height) {
        System.out.println("Rectangle area is: " + (width * height));
        System.out.println("Rectangle circumference is: " + (2*width + 2*height));
    }

}
