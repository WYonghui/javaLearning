package holding;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.*;

/**
 * Created by 10564 on 2017-10-12.
 */
public class TestIterator {

    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(8);
        Collection<Pet> ps = new TreeSet<>(pets);

        Iterator<Pet> it = ps.iterator();
        Pet p;
        while(it.hasNext()){
            p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }

    }
}
