package oop.constructor_overloading;

public class Student {
    String name,phone;
    int age;
    Student(){
        System.out.println("No params calls in constructor");
    }

    Student(String _name, String _phone){
        name = _name;
        phone = _phone;
    }
    Student(String _name, String _phone, int _age){
        name = _name;
        age = _age;
        phone = _phone;
    }

    void getInfo(){
        System.out.println("Name : "+ name+". Phone : "+ phone);
    }
    public static void main(String[] args) {
        Student st_01 = new Student();
        Student st_02 = new Student("Robin","01717642515");
        st_02.getInfo();
    }
}
