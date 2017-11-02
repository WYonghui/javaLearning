package ContainerTest;

import java.util.*;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by 10564 on 2017-10-11.
 */
public class PrintContainer {

    public static void main(String[] args) {

        Producer producer = new Producer();

        Collection<String> arrayList = new ArrayList<>();
        Collection<String> linkedList = new LinkedList<>();
        Collection<String> hashSet = new HashSet<>();
        Collection<String> linkedHashSet = new LinkedHashSet<>();
        Collection<String> treeSet = new TreeSet<>();

        String s = producer.next();
        while (s != null){
            arrayList.add(s);
            linkedList.add(s);
            hashSet.add(s);
            linkedHashSet.add(s);
            treeSet.add(s);
            s = producer.next();
        }

        System.out.println(arrayList);
        System.out.println(linkedList);
        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);

    }
}
