package string;

public class StringDemo {
    public static void main(String[] args) {
        String str_1 = "Robiul Awal";
        String str_2 = "Robiul Awal";

        char[] strs = {'R','O','B','I','U','L'};

        System.out.println(str_1);
        System.out.println(str_2);
        for (char ch : strs){
            System.out.print(ch);
        }
    }
}
