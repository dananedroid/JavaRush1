package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V1 = sc.nextInt();
        double Result = V1 * 3.6;
        int V2 = (int) Math.round(Result);
        System.out.println(V2);
    }
}