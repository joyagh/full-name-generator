package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello! Welcome to our full name generator!");
        System.out.println("Please enter your details.");

        System.out.print("First Name: ");
        String firstName = input.next();

        System.out.print("Middle Name: ");
        String middleName = input.next();

        System.out.print("Last Name: ");
        System.out.println("Suffix: ");
    }
}
