package com.example;

import java.util.*;

/**
 * RepeatName
 */
public class RepeatName {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String name;
        System.out.println("Enter your name: ");
        name = ob.nextLine();
        System.out.println("How many times you want to repeat: ");
        int n = ob.nextInt();
        System.out.println("-------------------------------");
        for (int i = 1; i <= n; i++) {
            System.out.println(name + " " + i);
        }
        System.out.println("-------------------------------");
        int i = 1;
        while (i <= n) {
            System.out.println(name + " " + i);
            i++;
        }
        System.out.println("-------------------------------");
        int cnt = 1;
        do {
            System.out.println(name + " " + cnt);
            cnt++;
        } while (cnt <= n);
        System.out.println("-------------------------------");
    }
}