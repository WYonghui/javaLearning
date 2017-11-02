package holding;

import typeinfo.pets.*;

import java.util.*;

import static sun.misc.Version.print;

/**
 * Created by 10564 on 2017-10-12.
 */
public class ListFeatures {

    public static void main(String[] args) {
//        Random rand = new Random();
        List<Integer> pets = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("1: " + pets);
        Integer h = new Integer(6);
        pets.add(h);
        System.out.println("2: " + pets);
        System.out.println("3: " + pets.contains(h));
        pets.remove(h);
        Integer p = pets.get(2);
        System.out.println("4: " + p + " " + pets.indexOf(p));

        Integer cymric = new Integer(4);
        System.out.println("5: " + pets.indexOf(cymric));
        System.out.println("6: " + pets.remove(cymric));

        pets.remove(p);
        System.out.println("7: " + pets);
        pets.add(2, new Integer(8));
        System.out.println("8: " + pets);

        List<Integer> subPets = pets.subList(1, 4);
        System.out.println("9: " + subPets);
        subPets.set(1, new Integer(9));
        System.out.println("10: " + pets);

        Object[] os = pets.toArray();
        System.out.println("22: " + os[3]);

        Integer[] ps = pets.toArray(new Integer[0]);
        System.out.println("23: " + ps[3]);
    }
}
