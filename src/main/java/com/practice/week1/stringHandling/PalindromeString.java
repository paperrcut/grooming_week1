package com.practice.week1.stringHandling;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String reverse="";
        for(int i= sentence.length()-1; i>=0;--i)
        {
            reverse = reverse + sentence.charAt(i);
        }
        if(sentence.equals(reverse))
        {
            System.out.println(sentence+" is palindrome.");
        }
        else
        {
            System.out.println(sentence+" is not palindrome.");
        }
    }
}
