package array;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

        int[] numbers = {50,25,-2,9,20};

        Arrays.sort(numbers);

        //asending sort
        System.out.println("Assending sort : ");
        for(int number : numbers){
            System.out.print(number + ",");
        }

        System.out.println();

        //desending sort
        System.out.println("dessending sort : ");
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.print(numbers[i] + ",");
        }
    }
}
