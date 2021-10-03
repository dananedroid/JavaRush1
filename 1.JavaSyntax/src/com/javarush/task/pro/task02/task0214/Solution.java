package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a1 = s.nextLine().toLowerCase();
        String a2 = s.nextLine().toUpperCase();
        String a3 = s.nextLine();


        System.out.println(a3);
        System.out.println(a2);
        System.out.println(a1);


    }
}
