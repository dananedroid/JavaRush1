package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner sc = new Scanner(System.in);
        boolean input = sc.nextBoolean();

        if (input == true) {
            int optimist = (int) Math.ceil(glass);
            System.out.println(optimist);
        } else if (input == false){
            int pessimist = (int) Math.floor(glass);
            System.out.println(pessimist);
        }
    }
}