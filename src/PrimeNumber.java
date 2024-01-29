import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;

        System.out.println("Please insert a number (Integer) : ");
        int num = input.nextInt();

        if(num == 0 || num == 1){
            System.out.print(num + " is not prime number");
            return;
        }else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
            if (count > 0){
                System.out.print(num + " is not prime number");
            }else{
                System.out.print(num + " is a prime number");
            }
        }


    }
}
