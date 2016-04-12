/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmedchoukri;

import com.sun.media.jfxmediaimpl.platform.Platform;
import java.util.Scanner;

public class PasswordGenCLI {

    public static void main(String[] args) {
        System.out.println("\n=========================================================");
        System.out.println("J-KEY Password Generator CLI Tool - Version 1.0");
        System.out.println("Copyright (c) AHMED CHOUKRI - 2015. All rights reserved.   ");
        System.out.println("========================================================= \n\n");

        Scanner optionSelection = new Scanner(System.in);

        System.out.println("Select one of the Following Options: \n");
        System.out.println("[1] - Generate passwords with special characters");
        System.out.println("[2] - No Special Characters");
        System.out.println("[Q] - Quit - Exit the program \n");
        System.out.print("Please Enter [1, 2, or Q]: ");

        String userInput = optionSelection.nextLine();

        switch (userInput) {

            case "1":

                FullPasswordGen fullPassword = new FullPasswordGen();
                fullPassword.generateFull();
                break;

            case "2":
                NoSpecialChars noSpecial = new NoSpecialChars();
                noSpecial.justAlphaNumeric();
                break;

            case "Q":
            case "q":
                System.out.println("\nThanks... Good Bye! \n");
                System.exit(0);

            default:
                System.out.println("Wrong user input, Please Try Again ...");
                System.exit(0);
                

        }
    }
}
