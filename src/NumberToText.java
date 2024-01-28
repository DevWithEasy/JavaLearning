import java.util.Scanner;

public class NumberToText {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Please insert a number 1-10 : ");
        number = input.nextInt();

        switch (number){
            case 1 :{
                System.out.println("One");
                break;
            }
            case 2 :{
                System.out.println("Two");
                break;
            }
            case 3 :{
                System.out.println("Three");
                break;
            }
            case 4 :{
                System.out.println("Four");
                break;
            }
            case 5 :{
                System.out.println("Five");
                break;
            }
            case 6 :{
                System.out.println("Six");
                break;
            }
            case 7 :{
                System.out.println("Seven");
                break;
            }
            case 8 :{
                System.out.println("Eight");
                break;
            }
            case 9 :{
                System.out.println("Nine");
                break;
            }
            case 10 : {
                System.out.println("Ten");
                break;
            }
            default:{
                System.out.println("Please insert correct number 1-10");
                break;
            }
        }
    }
}
