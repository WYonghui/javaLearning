package io;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.SortedMap;

/**
 * Created by 10564 on 2017-11-06.
 */
public class AvailableCharSets {

    public static void main(String[] args) {
        SortedMap<String, Charset> charSet = Charset.availableCharsets();

        Iterator<String> it = charSet.keySet().iterator();
        String str;
        while (it.hasNext()){
            str = it.next();
            System.out.print(str);

            Iterator<String> aliases = charSet.get(str).aliases().iterator();
            if (aliases.hasNext()){
                System.out.println(":");
            }

            System.out.print("{ ");
            while (aliases.hasNext()){
                System.out.print(aliases.next());
                if (aliases.hasNext())
                    System.out.print(", ");
            }
            System.out.println(" }");
        }
    }


}
