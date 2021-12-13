package com.teachmeskills.homework_4.homework3;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("Start");
        int[][] myArray = new int[3][3];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = 1 + (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + "|");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                sum += myArray[i][j];
            }
        }
        System.out.println("Sum:" + sum);
        System.out.println("End");
    }
}
