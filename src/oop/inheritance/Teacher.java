package oop.inheritance;

public class Teacher extends Person{
    String qualifiaction;
    void displayInfo_2(){
        displayInfo_1();
        System.out.println("Qualification : " + name);
    }
}
