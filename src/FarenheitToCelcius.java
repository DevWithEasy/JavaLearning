import java.util.Scanner;

public class FarenheitToCelcius {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double farenheit ;

        System.out.println("Insert Temp in farenheit");
        farenheit = input.nextDouble();

        System.out.println(farenheit);

        double result = (farenheit - 32) * (double) 5/9;

        System.out.println("Your result " + result);
    }
}
