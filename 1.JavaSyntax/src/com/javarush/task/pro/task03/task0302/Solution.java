package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призывная кампания
*/

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        Scanner c = new Scanner(System.in);
        String str = c.nextLine();
        Scanner a = new Scanner(System.in);
        int number = a.nextInt();
        if (28 >= number && number >= 18) {
            System.out.println(str + militaryCommissar);
        }

    }
}
