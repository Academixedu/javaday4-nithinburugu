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
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + " " + i);
        }
        int i = 1;
        while (i <= 10) {
            System.out.println(name + " " + i);
            i++;
        }
        int cnt = 1;
        do {
            System.out.println(name + " " + cnt);
            cnt++;
        } while (cnt <= 10);
    }
}