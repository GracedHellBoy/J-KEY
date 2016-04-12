/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmedchoukri;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ahmed
 */
public class NoSpecialChars {

    public void justAlphaNumeric() {

        Scanner passwordSizeInput = new Scanner(System.in);
        System.out.print("\n\nPassword length: ");
        int passwordSize = passwordSizeInput.nextInt();

        Scanner numberOfPasswordsInput = new Scanner(System.in);
        System.out.print("Number of passwords to generate: ");
        int numberOfPasswords = numberOfPasswordsInput.nextInt();
        System.out.println(" ");

        ArrayList<String> passwordElements = new ArrayList<>();

        passwordElements.add("A");
        passwordElements.add("B");
        passwordElements.add("C");
        passwordElements.add("D");
        passwordElements.add("E");
        passwordElements.add("F");
        passwordElements.add("G");
        passwordElements.add("H");
        passwordElements.add("I");
        passwordElements.add("J");
        passwordElements.add("K");
        passwordElements.add("L");
        passwordElements.add("M");
        passwordElements.add("N");
        passwordElements.add("O");
        passwordElements.add("P");
        passwordElements.add("Q");
        passwordElements.add("R");
        passwordElements.add("S");
        passwordElements.add("T");
        passwordElements.add("U");
        passwordElements.add("V");
        passwordElements.add("W");
        passwordElements.add("X");
        passwordElements.add("Y");
        passwordElements.add("Z");

        passwordElements.add("0");
        passwordElements.add("1");
        passwordElements.add("2");
        passwordElements.add("3");
        passwordElements.add("4");
        passwordElements.add("5");
        passwordElements.add("6");
        passwordElements.add("7");
        passwordElements.add("8");
        passwordElements.add("9");

        passwordElements.add("a");
        passwordElements.add("b");
        passwordElements.add("c");
        passwordElements.add("d");
        passwordElements.add("e");
        passwordElements.add("f");
        passwordElements.add("g");
        passwordElements.add("h");
        passwordElements.add("i");
        passwordElements.add("j");
        passwordElements.add("k");
        passwordElements.add("l");
        passwordElements.add("m");
        passwordElements.add("n");
        passwordElements.add("o");
        passwordElements.add("p");
        passwordElements.add("q");
        passwordElements.add("r");
        passwordElements.add("s");
        passwordElements.add("t");
        passwordElements.add("u");
        passwordElements.add("v");
        passwordElements.add("w");
        passwordElements.add("x");
        passwordElements.add("y");
        passwordElements.add("z");

        long startTime = System.currentTimeMillis();

        for (int passwordCount = 0; passwordCount < numberOfPasswords; passwordCount++) {

            for (int i = 0; i < passwordSize; i++) {

                Random randomIndx = new Random();
                int arrayIndexID = randomIndx.nextInt(passwordElements.size());
                System.out.print(passwordElements.get(arrayIndexID));

            }
            System.out.println(" ");
        }
        
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        double ms = ((double)elapsedTime)/1000; 
        System.out.println("\n\nGenerated " + numberOfPasswords + " Passwords in " + ms + " Seconds");
        
        Footer programFooter = new Footer();
        programFooter.witreFooter();
    }

}
