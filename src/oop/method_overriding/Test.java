package oop.method_overriding;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Robiul";
        t1.age = 17;
        t1.qualification = "B.Sc Engineering";
        t1.displayInfo();

        Person p1 = new Person();
        p1.name = "Awal";
        p1.age = 25;
        p1.displayInfo();
    }
}
