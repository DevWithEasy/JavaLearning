package oop.inheritance.access_private;

public class PTeacher extends PPerson{
    String qualification;

    void displayInfo(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(qualification);
        System.out.println("\n");
    }
}
