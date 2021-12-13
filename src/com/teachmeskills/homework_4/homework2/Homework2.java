package com.teachmeskills.homework_4.homework2;
public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Start");
        //в условии мы имеем две матрицы 3x3. Но в нем же одна матрица 3x4, а вторая 4x3. Ошибка? 
        int[][] myArray1 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int[][] myArray2 = {{1, 2, 3}, {0, 1, 0}, {0, 0, 0}};
        int[][] myArray3 = new int[3][4];

        System.out.println("Array1:");
        for (int i = 0; i < myArray1.length; i++) {
            for (int j = 0; j < myArray1[i].length; j++) {
                System.out.print(myArray1[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("Array2:");
        for (int i = 0; i < myArray2.length; i++) {
            for (int j = 0; j < myArray2[i].length; j++) {
                System.out.print(myArray2[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("Result:");
        for (int i = 0; i < myArray1.length; i++) {
            for (int j = 0; j < myArray1[i].length; j++) {
                myArray3[i][j] = myArray1[i][j] * myArray2[i][j];
            }
        }
        for (int i = 0; i < myArray3.length; i++) {
            for (int j = 0; j < myArray3[i].length; j++) {
                System.out.print(myArray3[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("End");
    }
}
