import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char ch;
        System.out.println("Please insert a letter..");
        ch = input.next().charAt(0);

        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U' ){
            System.out.println("Vowel");
        }else {
            System.out.println("Constant");
        }
    }
}
