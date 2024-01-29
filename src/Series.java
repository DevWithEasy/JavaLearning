import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,sum = 0;

        //1+2+3+4+5+...+n

        System.out.print("Input a number");

        n = input.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println("");
        System.out.println(sum);
    }
}
