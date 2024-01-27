public class StringsMethods {
    public static void printStr(String str){
        System.out.println(str);
    }
    public static void printInt(int num){
        System.out.println(num);
    }

    public static void main(String[] args){
        String hello = "Bangladesh is our homeland.";
        //index of char
        int index_string = hello.indexOf('h');
        printInt(index_string);

        //string length
        int length = hello.length();

        printInt(length);

    }
}
