package oop.instance_of;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        Person p = new Person();
        Teacher t = new Teacher();
        System.out.println(a instanceof Person);
        System.out.println(p instanceof Animal);
        System.out.println(t instanceof Person);
        System.out.println(p instanceof Teacher);
        System.out.println(a instanceof Teacher);
    }
}
