package string;

public class stringBuilder {
    public static void main(String[] args) {
        String str_1 = "Robiul";
        StringBuilder str_buffer = new StringBuilder(str_1);
        System.out.println(str_buffer);

        //01. append
        str_buffer.append(" Awal");
        System.out.println(str_buffer);

        //02. insert
        str_buffer.insert(str_buffer.length()," 68");
        str_buffer.insert(0,"Md ");
        System.out.println(str_buffer);

        //03. delete
        str_buffer.delete(str_buffer.length()-3,str_buffer.length());
        System.out.println(str_buffer);

        //04. reverse
        str_buffer.reverse();
        System.out.println(str_buffer);
    }
}
