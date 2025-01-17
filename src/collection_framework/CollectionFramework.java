package collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;



public class CollectionFramework {

    static <T> void print(T n){
        System.out.println("Hello "+n);
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6};

        // fixed size
        // same datatype
        // add remove

        ArrayList list = new ArrayList();
        list.add(12);
        list.add(12.34);
        list.add("Hello");
        System.out.println(list);

        LinkedList<String> data = new LinkedList<>();
//        data.ensureCapacity(20);
        data.add("Hello");
        data.add("Hi");
        data.add("Kem cho");
        data.add("Sayonara");
        System.out.println(data);
        data.remove("Hi");
        data.set(0,"Hola");   // update
        System.out.println(data);

        System.out.println(data.toArray());

        for(int i=0;i<data.size();i++){
            System.out.println(data.get(i));
        }

        // advance for loop

        for(String n : data){
            System.out.println(n);
        }

        ArrayList<String> data2 = new ArrayList<>();
        data2.add("Bye");
        data2.add("Good Bye");

        data.addAll(data2);
        System.out.println(data);

        data.clear();
        System.out.println(data);

        print(13);


    }
}
