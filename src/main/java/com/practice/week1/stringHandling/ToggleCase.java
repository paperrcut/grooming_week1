package com.practice.week1.stringHandling;

import java.util.Scanner;


public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String toggleSentence="";
        for(int i=0;i<sentence.length();i++)
        {
            if(Character.isUpperCase(sentence.charAt(i)))
            {
                toggleSentence +=(""+sentence.charAt(i)).toLowerCase();
            }
            else
            {
                toggleSentence +=(""+sentence.charAt(i)).toUpperCase();
            }
        }
        System.out.println("Toggled sentence: "+ toggleSentence);
    }
}
