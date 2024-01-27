import java.util.Scanner;

public class Operators {
    public static void  main(String[] args){
        //arithmetic_operator
        int a = 10;
        int b = 20;

        int a_b_plus = a+b;
        int a_b_minus = b-a;
        int a_b_multiplication = a*b;
        int a_b_division = b/a;
        int a_b_modules = b%a;

        System.out.println(a_b_plus+","+a_b_minus+","+a_b_multiplication+","+a_b_division+","+a_b_modules);

        //Unary_operator
        System.out.println(++a);
        System.out.println(--a);

        //comparison
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a != b);

//        conditional
        if((a== 10) && (b==20))
            System.out.println(a + " and " + b + " is correct");

        if((a== 10) || (b==30))
            System.out.println(a + " and " + b + " is correct");

//        format specifier
        System.out.printf("if want to print integer %d");
        System.out.printf("if want to print float %f");
        System.out.printf("if want to print float with specific point %.2f");
        System.out.printf("if want to print string %s");
        System.out.printf("if want to print character %c");
        System.out.printf("if want to print boolean %b");
    }
}
