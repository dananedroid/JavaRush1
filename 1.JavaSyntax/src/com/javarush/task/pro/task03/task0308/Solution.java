package com.javarush.task.pro.task03.task0308;

import java.util.Scanner;

/* 
Координатные четверти
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        boolean result1 = (x > 0) && (y > 0);
        boolean result2 = (x < 0) && (y > 0);
        boolean result3 = (x < 0) && (y < 0);
        boolean result4 = (x > 0) && (y < 0);
        if (result1)
            System.out.println(1);
        if (result2)
            System.out.println(2);
        if (result3)
            System.out.println(3);
        if (result4)
            System.out.println(4);
    }
}
