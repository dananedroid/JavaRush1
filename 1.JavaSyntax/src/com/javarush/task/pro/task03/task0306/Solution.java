package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        boolean true1 =  (number1 < number2+number3 && number2 < number1+number3 && number3 < number1+number2);
            if (true1)
                System.out.println(TRIANGLE_EXISTS);
         else
            System.out.println(TRIANGLE_NOT_EXISTS);
    }
}
