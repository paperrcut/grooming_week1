package com.practice.week1.exceptionHandling;

import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        try {
            int size = sc.nextInt();
            if (size < 1)
                throw new NegativeArraySizeException("Array size cannot be less than 1");
            int[] arr = new int[size];
            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                int num = sc.nextInt();
                if (num < 0)
                    throw new NegativeValueException("Array cannot contain negative values!");
                arr[i] = num;
            }
            int avg = 0;
            for (int i : arr)
                avg += i;
            avg = avg / size;

            System.out.println("Average: " + avg);
        } catch (NegativeValueException e) {
            System.out.println(e.getMessage());
        } catch (NegativeArraySizeException e) {
            System.out.println(e.getMessage());
        }

    }
}
