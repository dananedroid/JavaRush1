package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String text = " любит меня.";
        int n = 10;
        while (n > 0) {
            System.out.println(word + text);
            n--;
        }
    }
}
