package oop.method_overloading;

public class MethodOverload {
    void add(){
        System.out.println("No params insert.");
    }
    void add(int a, int b){
        System.out.println("Sum is 2-int-params: " + (a+b));
    }
    void add(double a, double b){
        System.out.println("Sum is 2-double-params: " + (a+b));
    }

    void add(int a, double b,double c){
        System.out.println("Sum is 2-double-params: " + (a+b+c));
    }
}
