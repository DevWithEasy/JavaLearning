import java.util.Scanner;

public class Input {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int number_01, number_02,result;
        System.out.println("First number ? ");
        number_01 = input.nextInt();

        System.out.println("Second number ? ");
        number_02 = input.nextInt();

        result = number_01 + number_02;

        System.out.println("Sum is " + result);
    }
}
