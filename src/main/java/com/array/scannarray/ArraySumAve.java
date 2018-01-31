package com.array.scannarray;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController

public class ArraySumAve {
    @RequestMapping("/")
    public String claswork() {

        int n, sum = 0;
        float average;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int buckey[]= new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n ; i++)
        {
            buckey[i] = s.nextInt();
            sum  += buckey[i];
        }
        System.out.println("Sum:"+sum);
        average = (float)sum / n;
        System.out.println("Average:"+average);
        return "sum :  " + String.valueOf(sum)+ " average : " + String.valueOf(average);
    }
     }



