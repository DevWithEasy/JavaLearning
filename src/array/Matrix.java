package array;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] a = new int [2][3];
        int[][] b = new int [2][3];
        int[][] c = new int [2][3];

        System.out.println("Please number for matrix a:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("a[%d][%d] = ",row,col);
                a[row][col] = input.nextInt();
            }
        }

        System.out.println("Please number for matrix b:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("b[%d][%d] = ",row,col);
                b[row][col] = input.nextInt();
            }
        }

        System.out.println("a = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("b = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }


        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                c[row][col] = a[row][col] + b[row][col];
            }
            System.out.println();
        }

        System.out.println("c = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(c[row][col] + " ");
            }
            System.out.println();
        }
    }
}
