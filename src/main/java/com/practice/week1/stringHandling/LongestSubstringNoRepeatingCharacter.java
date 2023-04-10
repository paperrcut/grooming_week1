package com.practice.week1.stringHandling;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstringNoRepeatingCharacter {
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        if(str.length()==0)
            System.out.println("ERR: NULL INPUT");
        else
            longestSubstring(str);

    }
    private static void longestSubstring(String str)
    {
        int n=str.length();
        int l=0;int r=0;
        int maxL=0; int maxR = 0; int maxStr =0;
        HashSet<Character> visited = new HashSet<>();
        while(r<n)
        {
            if(!visited.contains(str.charAt(r)))
            {
                visited.add(str.charAt(r));
                if(r-l+1>maxStr)
                {
                    maxStr = r-l+1;
                    maxL = l;
                    maxR = r;
                }
                r++;
            }
            else {
                visited.remove(str.charAt(l));
                l++;
            }
        }
        for(int i=maxL;i<=maxR;i++)
        {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
