package string;

public class stringBuffer {
    public static void main(String[] args) {
        String str_1 = "Robiul";
        StringBuffer str_buffer = new StringBuffer(str_1);
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
