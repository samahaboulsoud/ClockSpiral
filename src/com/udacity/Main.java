package com.udacity;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        //receiving the user input number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int numberOfElements = scanner.nextInt();
        //declare and initialize a 2D array to store elements according to user input
        int clockSpiral[][] = new int[numberOfElements][numberOfElements];

        int currentRow = 0; // stores current row number
        int currentColumn = 0; // stores current column number
        int maxCell = numberOfElements - 1; //stores and updates maximum number of cells
        int minCell = 0; //stores and updates the minimum number of cells

        final String RIGHT = "RIGHT";
        final String LEFT = "LEFT";
        final String UP = "UP";
        final String DOWN = "DOWN";

        String currentDirection = RIGHT;

        int elementSquare = numberOfElements * numberOfElements;

        while (elementSquare >= 1) {
            clockSpiral[currentRow][currentColumn] = elementSquare;
            switch (currentDirection) {
                case RIGHT:
                    currentColumn++;
                    if (currentColumn == maxCell) {
                        currentDirection = DOWN;
                    }
                    break;
                case DOWN:
                    currentRow++;
                    if (currentRow == maxCell) {
                        currentDirection = LEFT;
                    }
                    break;
                case LEFT:
                    currentColumn--;
                    if (currentColumn == minCell) {
                        currentDirection = UP;
                        maxCell --;
                        minCell ++;
                    }
                    break;
                case UP:
                    currentRow--;
                    if (currentRow == minCell) {
                        currentDirection = RIGHT;
                    }
                    break;
            }

            elementSquare--;

        }
        /* Printing the Clock Spiral */
        System.out.println("The Clock Spiral is:");
        for(int i=0;i<numberOfElements;i++)
        {
            for(int j=0;j<numberOfElements;j++)
            {
                System.out.print(clockSpiral[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}

