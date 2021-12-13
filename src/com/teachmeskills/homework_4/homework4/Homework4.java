package com.teachmeskills.homework_4.homework4;

public class Homework4 {
    public static void main(String[] args) {
        System.out.println("Start");
        int[][] myArray = new int[5][5];
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
        System.out.println("Result:");
        int number = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (i == number && j == number) {
                    number++;
                    System.out.print(myArray[i][j] + "|");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        System.out.println("End");
    }
}
