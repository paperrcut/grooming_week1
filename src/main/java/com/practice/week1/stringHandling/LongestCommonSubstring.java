package com.practice.week1.stringHandling;

import java.util.HashSet;
import java.util.Scanner;

public class LongestCommonSubstring {

    static String substring = "";
    static HashSet<String> substrings = new HashSet<>();
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter 1st sentence: ");
        String str1 = sc.nextLine();
        System.out.print("Enter 2nd sentence: ");
        String str2 = sc.nextLine();
        String bigStr=str1.length()>=str2.length()?str1:str2;
        String smallStr = str1.length()<str2.length()?str1:str2;
        if(str1.length()==0||str2.length()==0)
            System.out.println("ERR: NULL INPUT");
        else {
            commonSubstr(smallStr, bigStr);
            System.out.println(substring);
        }

    }
    private static void commonSubstr(String str,String str2)
    {
        if(!substrings.contains(str))
        {
            substrings.add(str);
            if(str2.indexOf(str)>=0&&str.length()>substring.length())
                substring=str;
            if(str.length()>1) {
                commonSubstr(str.substring(0, str.length() - 1),str2);
                commonSubstr(str.substring(1),str2);
            }
        }
    }
}
