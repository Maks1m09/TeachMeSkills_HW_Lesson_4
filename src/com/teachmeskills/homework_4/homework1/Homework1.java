package com.teachmeskills.homework_4.homework1;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println("Start");
        String[][] myArrays = new String[8][8];
        String cell1 = "W";
        String cell2 = "B";
        for (int i = 0; i < myArrays.length; i++) {
            for (int j = 0; j < myArrays[i].length; j++) {
                if ((i + j) % 2 != 0) {
                    myArrays[i][j] = cell1;
                    System.out.print(myArrays[i][j] + " ");
                } else {
                    myArrays[i][j] = cell2;
                    System.out.print(myArrays[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("End");
    }
}
