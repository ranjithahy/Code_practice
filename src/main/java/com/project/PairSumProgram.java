package com.project;

import java.util.*;
public class PairSumProgram {
        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            int[] arr = {1,2,3,4};
            int sumNumber= 1+2+3+4;
            int total_Number= sumNumber/2;
            for(int i=0;i<=arr.length-1;i++)
            {
                for(int j=arr.length-1;j>=0;j--)
                {
                    if(arr[i]+arr[j]==total_Number)
                    {
                        System.out.println("The Sum of number is:"+arr[i]+"and"+arr[j]+"is equal to:"+total_Number);
                    }
                }
            }
        }
    }

