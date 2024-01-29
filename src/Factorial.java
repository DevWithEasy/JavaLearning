import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,result = 1;
        System.out.print("Please insert a integer number : ");
        num = input.nextInt();

        for (int i = num; i >= 1 ; i--) {
            if (i==1){
                System.out.print(i + "!");
            }else {
                System.out.print(i + "! X ");
            }
            result = result * i;
        }
        System.out.println("");
        System.out.println(result);
    }
}
