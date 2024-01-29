import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number,sum = 0,temp,r;

        System.out.println("Please insert a digit");
        number = input.nextInt();

        temp = number;

        while(temp != 0){
            r = temp % 10;
            temp = temp / 10;
            sum = sum + r;
        }

        System.out.print(sum);
    }
}
