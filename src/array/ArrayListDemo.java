package array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        //get length
        System.out.println(numbers.size());

        //add item
        numbers.add(50);
        numbers.add(56);
        numbers.add(36);
        numbers.add(46);

        //print array
        System.out.println(numbers);

        //remove item
        numbers.remove(2);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + ", ");
        }
        System.out.println();

        for (int number : numbers){
            System.out.print(number + ", ");
        }
        System.out.println();


        Iterator ite = numbers.iterator();
        while (ite.hasNext()){
            System.out.print(ite.next() + ", ");
        }
        System.out.println();

        //remove all
        numbers.removeAll(numbers);
        System.out.println(numbers);

    }
}
