package com.udacity;
import java.util.Scanner;
public class MainOld {

    public static void main(String[] args) {
        // write your code here
        //receiving the user input number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int numberOfElements = scanner.nextInt();
//declare and initialize a 2D array acording to user input
        int clockSpiral[][] = new int[numberOfElements][numberOfElements];
        int firstColumn = 0; // first column to store element in the array clockSpiral
        int lastColumn = numberOfElements-1;//
        int firstRow = 0;
        int lastRow = numberOfElements-1;
        int elementSquare = numberOfElements*numberOfElements;
        while(elementSquare >= 1)
        {
            for(int i=firstColumn;i<=lastColumn;i++)
            {
                clockSpiral[firstRow][i]= elementSquare;
                elementSquare --;
            }

            for(int j=firstRow+1;j<=lastRow;j++)
            {
                clockSpiral[j][lastColumn]= elementSquare;
                elementSquare --;
            }

            for(int i=lastColumn-1;i>=firstColumn;i--)
            {
                clockSpiral[lastRow][i]= elementSquare;
                elementSquare --;
            }

            for(int j=lastRow-1;j>=firstRow+1;j--)
            {
                clockSpiral[j][firstColumn] = elementSquare;
                elementSquare --;
            }

            firstColumn++;
            lastColumn--;
            firstRow++;
            lastRow--;
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
