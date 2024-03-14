package oop;

public class Student {
    String name;
    Integer age;

    void setInfo(String _name, Integer _age){
        name = _name;
        age = _age;
    }
    void displayStudent(){
        System.out.println("Name is : " + name + ". Age is " + age);
    }
}
