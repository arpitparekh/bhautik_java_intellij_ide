package collection_framework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCollection {

    public static void main(String[] args) {

        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(12.34);
        numbers.add(13.34);
        numbers.add(14.34);
        numbers.add(15.34);

        System.out.println(numbers);

        for(int i=0;i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }

        for(Double d : numbers){
            System.out.println(d);
        }

        Iterator<Double> iter =  numbers.iterator();

//        while(iter.hasNext()){
//            System.out.println(iter.next());
//        }

        System.out.println();
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());
        iter.remove();
        System.out.println(iter.next());

        System.out.println(numbers);

        /*
        ListIterator<String> iterator = list.listIterator();

        // Iterate forward
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Iterate backward
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
         */

        /*
            Utility Classes remaining

            Collections: Static methods that operate on or return collections.
            Arrays: Static methods for manipulating arrays.
            Comparable and Comparator: Used for ordering elements in collections.

         */

    }
}
