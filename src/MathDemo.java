public class MathDemo {
    public static void main(String[] args) {
        int x = 20;
        int y = 30;
        int z = -10;
        float a = 256.68f;
        float b = 256.25f;

        //	It will return the Absolute value of the given value.
        System.out.println(Math.abs(z));

        //	It returns the Largest of two values.
        System.out.println(Math.max(x,y));

        //It is used to return the Smallest of two values.
        System.out.println(Math.min(x,y));

        //floor
        System.out.println(Math.floor(a));

        //ceil
        System.out.println(Math.ceil(a));

        //It is used to round of the decimal numbers to the nearest value.
        System.out.println(Math.round(b));

        //random
        System.out.println(Math.round(Math.random() * 101));

    }
}
