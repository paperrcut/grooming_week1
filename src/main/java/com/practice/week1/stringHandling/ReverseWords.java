package com.practice.week1.stringHandling;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split("[[ ]+|[,]+|[.]+]+");
        String res = "";
        for (String word : words) {
            String reverse = "";
            for (int i = word.length() - 1; i >= 0; --i) {
                reverse = reverse + word.charAt(i);
            }
            res = res + reverse + " ";
        }
        System.out.println(res);
    }
}
