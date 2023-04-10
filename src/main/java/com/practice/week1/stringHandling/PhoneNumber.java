package com.practice.week1.stringHandling;

import java.util.Scanner;
public class PhoneNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String rawNumber;
        do {
            System.out.print("Enter phone number in given format (XXX) XXX-XXXX: ");
            rawNumber = sc.nextLine();
        }
       while (!rawNumber.matches("\\(\\d{3}\\)\\s\\d{3}-\\d{4}"));

       String phoneNumber = rawNumber.replaceAll("[()\\s-]","");
       int numOfDigits = phoneNumber.length();
       int[] digits = new int[numOfDigits];
       int i=0;
       for(char c : phoneNumber.toCharArray())
       {
           digits[i++] = Character.getNumericValue(c);
       }
       phoneNumber = phoneNumber.substring(0,3) + "-"+phoneNumber.substring(3,6)+"-"+phoneNumber.substring(6);

       System.out.println("Phone Number: "+phoneNumber);
       System.out.println("Number of digits: "+numOfDigits);
       System.out.print("Digits Array: ");
        for (int digit :digits) {
            System.out.print(digit +" ");
        }
    }
}
