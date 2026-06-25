package com.project;

import java.util.*;
class placeOneAtEnd
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size= scan.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[size];
        for(int i=0;i<=arr.length-1;i++)
        {
            arr[i]=scan.nextInt();
        }
        int count =0;
        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i]!=1)
            {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }

        }
        System.out.print("The final Array elements are: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}




