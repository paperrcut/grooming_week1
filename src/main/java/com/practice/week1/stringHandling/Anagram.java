package com.practice.week1.stringHandling;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string 1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter string 2: ");
        String str2 = sc.nextLine();

        if (str1.length()==str2.length()) {
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            char[] charstr1 = str1.toCharArray();
            char[] charstr2 = str2.toCharArray();

            Arrays.sort((charstr1));
            Arrays.sort((charstr2));

            if (Arrays.equals(charstr1, charstr2)) {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        }
        else
            System.out.println(str1 + " and " + str2 + " are not anagram.");
    }
}
