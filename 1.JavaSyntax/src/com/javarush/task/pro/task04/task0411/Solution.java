package com.javarush.task.pro.task04.task0411;

/* 
Четные числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        for (int number = 1; number <= 15; number++) {
            if ((number % 2) == 0)
                System.out.println(number);

        }
    }
}