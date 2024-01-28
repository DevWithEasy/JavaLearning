public class LoopDemo {
    public static void main(String[] args) {

        //for loop
        for (int i = 1 ; i <=10 ; i++ ){
            System.out.println(i);
        }

        //while loop

        int i = 2;
        while (i <= 10){
            System.out.println(i);
            i = i+2;
        }

        // do while
        int x = 1;
        do {
            System.out.println(x);
            x++;
        }while (x <= 10);
    }
}
