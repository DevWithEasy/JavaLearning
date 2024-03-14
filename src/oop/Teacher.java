package oop;

public class Teacher {
    String name,phone,email;
    Teacher(String _name, String _phone, String _email){
        name = _name;
        phone = _phone;
        email = _email;
    }
    void getName(){
        System.out.println(name);
    }
}
