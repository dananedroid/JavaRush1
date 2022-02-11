package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCoke = sc.nextInt();
        int numberOfPeople= sc.nextInt();
        double Result = numberOfCoke * 1.0 / numberOfPeople;
        System.out.println(Result);
    }
}