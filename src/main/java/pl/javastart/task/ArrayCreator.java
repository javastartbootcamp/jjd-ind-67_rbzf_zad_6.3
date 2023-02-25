package pl.javastart.task;

import java.util.Scanner;

public class ArrayCreator {

    private Scanner scanner = new Scanner(System.in);

    int readRow() {
        int row;
        do {
            System.out.println("Podaj liczbe wierszy tablicy (maksymalnie 100):");
            row = scanner.nextInt();
        } while (row <= 0 || row > 100);
        return row;
    }

    int readColumn() {
        int column;
        do {
            System.out.println("Podaj liczbe kolumn tablicy (maksymalnie 100):");
            column = scanner.nextInt();
        } while (column <= 0 || column > 100);
        return column;
    }

    int[][] createArray(int row, int column) {
        return new int[row][column];
    }

    void fillInArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i * j;
            }
        }
    }

    void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d |", array[i][j]);
            }
            int line = 6 * array[0].length;
            System.out.println();
            for (int k = 0; k < line; k++) {
                System.out.printf("%s", "-");
            }
            System.out.println();
        }
    }

}
