package array;

import java.util.Scanner;

public class MatrixDaigonalSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] numbers = new int[3][4];

        int sumOfDiagonalNumbers = 0;
        int sumOfUpperNumbers = 0;
        int sumOfLowerNumbers = 0;

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.printf("numbers[%d][%d] = ",row,col);
                numbers[row][col] = input.nextInt();
            }
        }

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(numbers[row][col] + " ");
            }
            System.out.println();
        }

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                if(row == col){
                    sumOfDiagonalNumbers = sumOfDiagonalNumbers + numbers[row][col];
                }
                if(row > col){
                    sumOfUpperNumbers = sumOfUpperNumbers + numbers[row][col];
                }
                if(row < col){
                    sumOfLowerNumbers = sumOfLowerNumbers + numbers[row][col];
                }
            }
        }
        System.out.println(sumOfDiagonalNumbers);
        System.out.println(sumOfUpperNumbers);
        System.out.println(sumOfLowerNumbers);
    }
}
