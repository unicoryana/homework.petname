package com.homework.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Strings: ex.1 Replace \"Test\" in \"My name is test with text from console\" \n Type your name: ");
        Scanner scanner = new Scanner(System.in);
        String yourname = scanner.nextLine();

        String str = "My name is test";
        replace(str, yourname);

        System.out.println("Strings: ex.2 Compare two strings - are they equal?");
        System.out.println("Type string 1: ");
        String str1 = scanner.nextLine();

        System.out.println("Type string 2: ");
        String str2 = scanner.nextLine();
        comparison(str1, str2);


        System.out.println("Strings: ex.3 Count words in a string (Divide text by whitespace)");
        String text = scanner.nextLine();
        countWords(text);

        System.out.println("concatenation text example: ");
        concatetext(yourname, str1, str2);
    }

    public static void replace(String str, String yourname){
        System.out.println(str.replace("test", yourname));
    }

    public static void comparison(String str1, String str2) {
        System.out.println(str1.equals(str2));
    }
    public static void countWords(String text) {
        System.out.println(text.split(" ").length);
    }

    public static void concatetext(String yourname, String str1, String str2) {
        System.out.println(yourname + " " + str1 + " " + str2);
    }

}
