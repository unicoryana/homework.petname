package com.homework.pet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What's your pet's name: ");
        Scanner scanner = new Scanner(System.in);
        String petname = scanner.nextLine();

        System.out.println("What most does " + petname + " like to do?");
        String likesmost = scanner.nextLine();

        printData(petname, likesmost);

    }

    public static void printData(String petname, String likemost) {
        System.out.println("Hey, little " + petname + " show me your " + likemost);
    }
}
