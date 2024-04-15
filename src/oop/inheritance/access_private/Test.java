package oop.inheritance.access_private;

public class Test {
    public static void main(String[] args) {
        PTeacher teacher1 = new PTeacher();
        teacher1.setName("Robin Away");
        teacher1.setAge(27);
        teacher1.qualification = "B.Sc in Engineering.";
        teacher1.displayInfo();

        PTeacher teacher2 = new PTeacher();
        teacher2.setName("Yasmin Baby");
        teacher2.setAge(25);
        teacher2.qualification = "B.Sc in Engineering.";
        teacher2.displayInfo();
    }
}
