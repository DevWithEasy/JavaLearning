import java.util.Scanner;

public class PrimeNumberFind {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please a start number : ");
        int start = input.nextInt();

        System.out.println("Please a end number : ");
        int end = input.nextInt();

        int count = 0;
        int totalPrime = 0;

        for (int i = start; i <= end; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    count++;
                    break;
                }
            }
            if (count == 0){
                System.out.println(i);
                totalPrime++;
            }
            count = 0;
        }
        System.out.println("Total prime number from " + start + " to " + end + " is " + totalPrime);
    }
}
