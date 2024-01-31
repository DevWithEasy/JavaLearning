package array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> numbers1 = new ArrayList<Integer>();

        //methods are add,size,remove,removeAll,clear,indexOf,isEmpty,contains
        //print by - forEach,forLoop,Iterator

        //add item
        numbers.add(50);
        numbers.add(56);
        numbers.add(36);
        numbers.add(46);

        //print array
        System.out.println(numbers);

        //get length
//        System.out.println(numbers.size());

        //remove item
//        numbers.remove(2);
//
//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.print(numbers.get(i) + ", ");
//        }
//        System.out.println();
//
//        for (int number : numbers){
//            System.out.print(number + ", ");
//        }
//        System.out.println();


//        Iterator ite = numbers.iterator();
//        while (ite.hasNext()){
//            System.out.print(ite.next() + ", ");
//        }
//        System.out.println();

          //remove all
//        numbers.removeAll(numbers);
//        numbers.clear();
//        System.out.println(numbers);

        //check arrayList is empty
//        boolean isEmpty = numbers.isEmpty();
//        System.out.println(isEmpty);

        //find index position
//        int index = numbers.indexOf(50);
//        System.out.println(index);

        //check contain element
//        boolean isContain = numbers.contains(50);
//        System.out.println(isContain);

        //set or replace item
//        numbers.set(0,51);
//        System.out.println(numbers);


        //forEach
//        numbers.forEach((n)->{
//            System.out.print(n + " ,");
//        });

        //conditional remove
//        ArrayList<Integer> cloneArray = (ArrayList<Integer>)numbers.clone();
//        cloneArray.removeIf((n)-> n%2 ==0);
//        System.out.println(cloneArray);

        //addAll
        numbers1.addAll(numbers);
//        System.out.println(numbers1);


    }
}
