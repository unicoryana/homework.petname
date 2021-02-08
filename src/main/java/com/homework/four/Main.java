package com.homework.four;

public class Main {
    public static void main(String[] args) {
        PersonalInfo personalInfo = new PersonalInfo();
        personalInfo.setRating(6);
        System.out.println(personalInfo.getRating());
        ContactInformation contactInfo = personalInfo.getContactInfo();
        System.out.println(contactInfo);

    }
}
