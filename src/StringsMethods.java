public class StringsMethods {
    public static void printStr(String str){
        System.out.println(str);
    }
    public static void printInt(int num){
        System.out.println(num);
    }

    public static void main(String[] args){
        String hello = "Bangladesh is our homeland.";
        String world = "We love our country.";
        //index of char
        int index_string = hello.indexOf('h');
        printInt(index_string);

        //string length
        int length = hello.length();
        printInt(length);

        //concat
        String conceited = hello.concat(world);
        printStr(conceited);

        //lowercase
        String lower = hello.toLowerCase();
        printStr(lower);

        //uppercase
        String upper = hello.toUpperCase();
        printStr(upper);

        //trim
        String trimed = world.trim();
        printStr(trimed);

        //charAt
        char findChar = hello.charAt(0);
        System.out.println(findChar);

    }
}
