package ex24;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nyles Symonette
 */

import java.util.Arrays;
import java.util.Scanner;


public class App {
    public static boolean areAnagrams(String firstString, String secondString) {
        if (firstString.length() != secondString.length())
            return false;

        // Convert string to characters
        char firstStringChars[] = firstString.toCharArray();
        char secondStringChars[] = secondString.toCharArray();
        // Sort individual characters of the strings
        Arrays.sort(firstStringChars);
        Arrays.sort(secondStringChars);

        return Arrays.equals(firstStringChars, secondStringChars);
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = inputScanner.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = inputScanner.nextLine();

        if (areAnagrams(firstString, secondString)) {
            System.out.println("\"" + firstString + "\" and \"" + secondString + "\" are anagrams.");
        } else {
            System.out.println("\"" + firstString + "\" and \"" + secondString + "\" are not anagrams.");
        }
        inputScanner.close();
    }
}
