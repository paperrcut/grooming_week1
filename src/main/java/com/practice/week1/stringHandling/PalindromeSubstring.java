package com.practice.week1.stringHandling;

import java.util.HashSet;
import java.util.Scanner;

public class PalindromeSubstring {

    static HashSet<String> substrings = new HashSet<>();
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        palindromeSubstr(str);
        for(String s:substrings)
        {
            System.out.println(s);
        }
    }

    private static void palindromeSubstr(String str)
    {
        if (!substrings.contains(str)) {
            if(isPlaindrome(str))
                substrings.add(str);
            if(str.length()>1) {
                palindromeSubstr(str.substring(0, str.length() - 1));
                palindromeSubstr(str.substring(1));
            }
        }
    }
    private static boolean isPlaindrome(String str)
    {
        String reverse="";
        for(int i= str.length()-1; i>=0;--i)
        {
            reverse = reverse + str.charAt(i);
        }
        if(reverse.equalsIgnoreCase(str))
            return true;
        else
            return false;
    }

}
