package array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Robiul");
        names.add("Rubel");
        names.add("Rasel");

        System.out.println(names);

        //ascending
        Collections.sort(names);
        System.out.println(names);

        //descending
        Collections.sort(names,Collections.reverseOrder());
        System.out.println(names);
    }
}
