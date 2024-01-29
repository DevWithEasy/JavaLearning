import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,sum = 0;

        System.out.print("Input a number : ");

        n = input.nextInt();

        //1+2+3+4+5+...+n
//        for (int i = 1; i <= n ; i++) {
//            System.out.print(i + " ");
//            sum = sum + i;
//        }

        //1+3+5+7+9+...+n
//        for (int i = 1; i <= n ; i = i+2) {
//            System.out.print(i + " ");
//            sum = sum + i;
//        }

        //2+4+6+8+10+...+n
        for (int i = 2; i <= n ; i = i+2) {
            System.out.print(i + " ");
            sum = sum + i;
        }

        System.out.println("");
        System.out.println(sum);
    }
}
