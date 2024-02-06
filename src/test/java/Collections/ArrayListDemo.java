package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {

        // Add item to the Array List
        ArrayList al= new ArrayList();   // si quisieramos que la lista solo tenga un tipo de dato (ej Int), se haría asi: ArrayList <Intiger> al= new ArrayList<Intiger>();
        al.add(10);
        al.add("algo");
        al.add(true);

        System.out.println(al.size());
        System.out.println(al);

        // Remove item to the Array List

        al.remove(0);
        System.out.println(al);

        al.add(10);
        al.add("algo");
        al.add(20);
        al.add("otro");
        System.out.println(al);

        //Fetch items from the Array list

        System.out.println(al.get(3));

        //Access ArrayList with For Loop

        for (int i=0; i<al.size();i++)
        {
            System.out.println(al.get(i));
        }
        //Access ArrayList with Enhanced For.

        for (Object obj: al)
        {
            System.out.println(obj);
        }

        //Access ArrayList with Iterator
        Iterator itr= al.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());

            // For each

            al.forEach(System.out::println);
        }

    }
}
