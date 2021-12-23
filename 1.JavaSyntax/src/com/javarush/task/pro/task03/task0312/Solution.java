package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        String text1 = console.nextLine();
        String text2 = console.nextLine();
        String result = text1.equals(text2) ? "Одинаковые" : "Разные";
        System.out.println(result);

        //System.out.println (text1.equals(text2));

        // if (true) {
        //System.out.println("строки одинаковые");
         //else {
         //   System.out.println("строки разные");

        }
}
