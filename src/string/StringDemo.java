package string;

public class StringDemo {
    public static void main(String[] args) {
        String str_1 = "Bangladesh is your homeland.";
        String str_2 = "We love your country.";

        //System.out.println(str_1);
        //System.out.println(str_2);

        //----------strings methods------------

        //01. charAt
        char findChar = str_1.charAt(0);
        //System.out.println(findChar);

        //02. concat
        String str_concat = str_1.concat(str_2);
        //System.out.println(str_concat);

        //03. contains
        boolean isFind = str_1.contains("is");
        //System.out.println(isFind);

        //04. equals and equalsIgnoreCase
        String str_3 = "Bangladesh";
        String str_4 = "bangladesh";
        boolean isEqual = str_3.equals(str_4);
        boolean isEqual_1 = str_3.equalsIgnoreCase(str_4);
        //System.out.println(isEqual);
        //System.out.println(isEqual_1);

        //05. startsWith
        boolean isStart = str_1.startsWith("B");
        //System.out.println(isStart);

        //06. toLowerCase
        String  str_5 = str_1.toLowerCase();
        //System.out.println(str_5);

        //07. toUpperCase
        String str_6 = str_1.toUpperCase();
        //System.out.println(str_6);

        //08. isEmpty
        boolean isEmpty = str_1.isEmpty();
        //System.out.println(isEmpty);

        //09. length
        int length = str_1.length();
        //System.out.println(length);

        //10. indexOf
        int index = str_1.indexOf("i");
        //System.out.println(index);

        //11. lastIndexOf
        int lastIndex = str_1.lastIndexOf("e");
        //System.out.println(lastIndex);

        //12. replace
        String replace_string = str_1.replace("n","m");
        System.out.println(replace_string);

        //13. trim
        String str_7 = "   Bangladesh is our Motherland.      ";
        //System.out.println(str_7.trim());

        //14 . split
        String[] words = str_1.split(" ");
//        for(String x:words){
//            System.out.println(x);
//        }

    }
}
