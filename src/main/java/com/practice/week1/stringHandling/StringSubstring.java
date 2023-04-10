package com.practice.week1.stringHandling;

import java.util.Scanner;

public class StringSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string 1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter string 2: ");
        String str2 = sc.nextLine();

        if(str2.indexOf(str1)!=-1)
        {
            System.out.println(str1+" is a substring of "+str2);
        }
        else
            System.out.println(str1+" is not a substring of "+str2);
    }
}