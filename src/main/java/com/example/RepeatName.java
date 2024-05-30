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
        for (int i = 1; i <= n; i++) {
            System.out.println(name + " " + i);
        }
        int i = 1;
        while (i <= n) {
            System.out.println(name + " " + i);
            i++;
        }
        int cnt = 1;
        do {
            System.out.println(name + " " + cnt);
            cnt++;
        } while (cnt <= n);
    }
}