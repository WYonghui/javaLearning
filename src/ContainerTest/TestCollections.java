package ContainerTest;

import java.util.*;

/**
 * Created by 10564 on 2017-10-12.
 */
public class TestCollections {

    public static void main(String[] args) {
        List<String> l1 = new LinkedList<>(Arrays.asList("a0", "a1", "a2", "a3", "a4", "a5", "a6"));

        System.out.println(l1);
        Collections.shuffle(l1);
        System.out.println(l1);
        System.out.println(Collections.binarySearch(l1, "a4"));

        Collections.reverse(l1);
        System.out.println(l1);

        Collections.sort(l1);
        System.out.println(l1);

        System.out.println(Collections.binarySearch(l1, "a4"));
        List<String> l2 = new LinkedList<>(Arrays.asList("a00", "a01", "a02", "a30", "a04", "a50", "a06"));
        Collections.copy(l2, l1);
        System.out.println(l2);

    }
}
