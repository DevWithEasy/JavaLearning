import java.util.Scanner;

public class CheckElderNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,result;

        System.out.println("Please insert two number:");

        num1 = input.nextInt();
        num2 = input.nextInt();

        result = (num1 > num2) ? num1 : num2 ;

        System.out.println(result);
    }
}
