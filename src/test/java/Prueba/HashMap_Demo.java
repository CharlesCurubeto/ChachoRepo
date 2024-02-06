package Prueba;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap_Demo {
    public static void main(String[] args) {

        /*
        Hash Maps contains data as Key , Value Pairs.
        Contains only unique keys.
        Not synchronized and No order.
        Java Hash Map may have one null key and multiple null values.
         */

        // creación del objeto hashmap
        HashMap <String,String> hm1 = new HashMap<String,String> ();

        // Agregar valores al hash map

        hm1.put("qa", "http://qa.com");
        hm1.put("uat", "http://uat.com");
        hm1.put("preprod", "http://preprod.com");
        hm1.put("prod", "http://prod.com");

        System.out.println(hm1);

        //remover valores:

        //hm1.remove("qa"); // se puede remover citando solo el Key,
        //hm1.remove("uat","http://uat.com"); // o citando el key -value.
        //System.out.println(hm1);

        // Print the values: there are multiple ways:

        Set s= hm1.keySet(); // esto devuelve los keys del hashmap

        // Foreach loop
        for (String key:hm1.keySet())
        {
            System.out.println("Key is: "+ key + " Value is: "+hm1.get(key));
        }

    // otra forma

        Set t= hm1.keySet(); // igual que antes.
        Iterator <String> itr= t.iterator();
        while (itr.hasNext())
        {
            String key= itr.next();
            System.out.println("Key is: "+ key + " Value is: "+hm1.get(key));
        }


    }
}
