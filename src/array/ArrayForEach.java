package array;

public class ArrayForEach {
    public static void main(String[] args) {
        String [] names = {"Robiul", "Rubel", "Rasel", "Zakir", "Asadur"};

        for(String name : names){
            System.out.println(name + ",");
        }

        int[] numbers = {25,2,85,58,25,65,81};
        int sum = 0;
        for (int n : numbers){
            sum += n;
        }

        System.out.println(sum);
    }
}
