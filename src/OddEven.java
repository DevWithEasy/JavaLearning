import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Please insert a integer number");
        number = input.nextInt();

        if (number%2 == 0){
            System.out.println("This is Even number.");
        }else{
            System.out.println("This is Odd number.");
        }
    }
}
