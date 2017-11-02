package holding;

import java.util.*;

/**
 * Created by 10564 on 2017-10-14.
 */
public class test19 {

    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(1, 5, 3, 20, 34, 4, 19, 23));
        System.out.println("HashSet : " + hashSet);
        Set<Integer> linkedHashSet = new LinkedHashSet<>(hashSet);
        System.out.println("LinkedHashSet1 : " + linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        treeSet.addAll(hashSet);
        System.out.println("TreeSet : " + treeSet);

        Set<Integer> linkedHashSet2 = new LinkedHashSet<>(treeSet);
        System.out.println("linkedHashSet2 : " + linkedHashSet2);
    }
}
