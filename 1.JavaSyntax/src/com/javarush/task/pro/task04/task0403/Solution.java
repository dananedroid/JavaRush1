package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean Exit = false;
        int number = 0;
        while (!Exit) {
            if (scanner.hasNextInt()) {
                number = number + scanner.nextInt();
            } else {
            String str = scanner.nextLine();
            Exit = str.equals("ENTER");
            }
        }
        System.out.println(number);

    }
}