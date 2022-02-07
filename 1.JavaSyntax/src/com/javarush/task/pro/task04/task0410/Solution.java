package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
//        int min = 0;
//        int abc = 0;
//
//        int n = console.nextInt();
//        min = n;
//        abc = n;
//
//
//        while (console.hasNextInt()) {
//            n = console.nextInt();
//            if (n < min) {
//                abc = min;
//                min = n;
//            }
//
//            if (min > n && n < abc ) {
//                min = n;
//            } else if (abc == min && n > min) {
//                abc = n;
//            }
//        }
//        System.out.println(abc);

//        Scanner sc = new Scanner (System.in);
//        int min = 0;
//        int n = sc.nextInt();
//
//        while (sc.hasNextInt()) {
//
//        }

        Scanner console = new Scanner(System.in);
        int min = console.nextInt();
        int secondMin = console.nextInt();

        if (secondMin < min) {
            int tmp = min;
            min = secondMin;
            secondMin = tmp;
        }
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if(min == secondMin) {
                if(x < min) {
                    min = x;
                } else {
                    secondMin = x;
                }
            } else if (x < min) {
                secondMin = min;
                min = x;
            } else if (x > min && x < secondMin) {
                secondMin = x;
            }
        }
        System.out.println(secondMin);
    }

    }
