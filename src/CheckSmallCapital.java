import java.util.Scanner;

public class CheckSmallCapital {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char ch;
        System.out.println("Please insert a letter..");
        ch = input.next().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println(ch + " is Small letter.");
        }else if(ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is Capital letter.");
        }
    }
}
