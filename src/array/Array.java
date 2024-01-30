package array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] numbers = new int[5];
        System.out.print("please input 5 number : ");

        for (int i = 0; i < numbers.length; i++) {
           numbers[i] = input.nextInt();
        }

        int max =  numbers[0];
        int min = numbers[0];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max){
                max = numbers[i];
            }

            if (numbers[i] < min){
                min = numbers[i];
            }

            sum = sum + numbers[i];
        }

        double avg = sum / numbers.length;

        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
        System.out.println(avg);
    }
}
