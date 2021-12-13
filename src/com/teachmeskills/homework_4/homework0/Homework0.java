package com.teachmeskills.homework_4.homework0;

import java.util.Scanner;

public class Homework0 {
    public static void main(String[] args) {
        System.out.println("Start");
        int[][][] myArray = {{{5, 1, 2, 3}, {7, 2, 3, 4}}, {{8, 3, 5, 6}}};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scanner.nextInt();
        for (int[][] myArray1 : myArray) {
            for (int[] myArray2 : myArray1) {
                for (int myArray3 : myArray2) {
                    System.out.print(myArray3 + " ");
                    System.out.println();
                }
                System.out.println();
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                for (int k = 0; k < myArray[i][j].length; k++) {
                    myArray[i][j][k] = number + myArray[i][j][k];
                }
            }
        }
        System.out.println("New result:");
        for (int[][] myArray1 : myArray) {
            for (int[] myArray2 : myArray1) {
                for (int myArray3 : myArray2) {
                    System.out.print(myArray3 + " " + "|");
                    System.out.println();
                }
                System.out.println();
            }
        }
        System.out.println("End");
    }
}
