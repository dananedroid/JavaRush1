package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text1 = console.nextLine();
        String text2 = console.nextLine();
        if (text1.equals(text2)) {
            System.out.println("строки одинаковые");
        } else {
            System.out.println("строки разные");
        }
    }
}
