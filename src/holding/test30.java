package holding;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by 10564 on 2017-10-14.
 */
public class test30 implements Collection<Pet>{
    private Pet[] pets = Pets.createArray(8);

    @Override
    public int size() {
        return pets.length;
    }

    @Override
    public boolean isEmpty() {
        return pets.length == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i].equals(o)) return true;
        }
        return false;
    }

    @Override
    public Iterator<Pet> iterator() {

        return new Iterator<Pet>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        return pets;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(Pet t) {

        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Pet> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
