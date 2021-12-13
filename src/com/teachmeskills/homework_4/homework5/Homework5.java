package com.teachmeskills.homework_4.homework5;

import java.util.Arrays;

public class Homework5 {
    public static void main(String[] args) {
        System.out.println("Start");
        int[][] m = new int[3][3];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = 0 + (int) (Math.random() * 1000);
            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + "!");
            }
            System.out.println("");
        }
        System.out.println("Result:");
        for (int i = 0; i < m.length; i++) {
            Arrays.sort(m[i]);
            for (int j = 0; j < m.length; j++) {
                Arrays.sort(m[j]);
            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + "!");
            }
            System.out.println("");
        }
        System.out.println("End");
    }
}
