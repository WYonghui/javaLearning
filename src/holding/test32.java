package holding;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.*;

/**
 * Created by 10564 on 2017-10-14.
 */
public class test32 implements Iterable<Pet>{

    private Pet[] pets = Pets.createArray(8);

    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };

    }

    public Iterable<Pet> reversed(){
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>(){
                    int lastIndex = pets.length-1;
                    @Override
                    public boolean hasNext() {
                        return lastIndex > -1;
                    }

                    @Override
                    public Pet next() {
                        return pets[lastIndex--];
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };

    }

    public Iterable<Pet> randomized(){
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                List<Pet> list = new ArrayList<>(Arrays.asList(pets));
                Collections.shuffle(list);
                return list.iterator();
            }
        };
    }

    public static void main(String[] args) {
        test32 t = new test32();

        for (Pet p : t){
            System.out.print(p + " ");
        }
        System.out.println();

        for (Pet p : t.reversed()){
            System.out.print(p + " ");
        }
        System.out.println();

        for (Pet p : t.randomized()){
            System.out.print(p + " ");
        }
        System.out.println();
    }
}
