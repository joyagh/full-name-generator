package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello! Welcome to our full name generator!");
        System.out.println("Please enter your details.");

//        System.out.print("Suffix: ");
//        String suffix = input.next();

//        if (suffix.matches("[a-zA-Z0-9]*$")){
//            System.out.println(suffix + ".");
//        }else {
//            System.out.println("No special characters please");
//        };




        System.out.print("First Name: ");
        String firstName = input.nextLine();

        System.out.print("Middle Name: ");
        String middleName = input.nextLine();

        System.out.print("Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Suffix: ");
        String suffix = input.nextLine();

        String fullName;

        if (middleName.isEmpty() && suffix.isEmpty()){
            fullName = firstName + " " + lastName;

        } else if(!middleName.isEmpty() && suffix.isEmpty()){
            fullName = firstName + " " + middleName + " " + lastName;

        } else if (middleName.isEmpty() && !suffix.isEmpty()){
            fullName = firstName + " " + lastName + ", " + suffix;
        } else {
            fullName = firstName + " " + middleName + " " + lastName + ", " + suffix;
        }






        System.out.println("Full name: " + fullName);

        input.close();




    }
}
