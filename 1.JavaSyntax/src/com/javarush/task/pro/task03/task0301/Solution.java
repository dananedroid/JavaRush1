package com.javarush.task.pro.task03.task0301;

import java.util.Scanner;

/* 
Тепло или холодно
*/

public class Solution {
    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);
        int number = c.nextInt();
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        if (number<0)
            System.out.println(cold);

        if (number>=0)
            System.out.println(warm);

    }
}
