package com.practice.week1.stringHandling;

import java.util.Scanner;

public class ReplaceSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter substring to replace: ");
        String str2 = sc.nextLine();
        System.out.print("Enter replacement string: ");
        String str3 = sc.nextLine();

        str1=str1.replaceAll(str2,str3);
        System.out.println("Replaced string: "+str1);

    }
}
