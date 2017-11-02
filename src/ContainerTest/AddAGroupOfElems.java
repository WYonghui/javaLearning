package ContainerTest;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by 10564 on 2017-10-11.
 */
public class AddAGroupOfElems {

    public static void main(String[] args) {
        Collection<Integer> container = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));

        container.addAll(Arrays.asList(6, 7, 8, 9));
        Integer[] moreElems = new Integer[]{10, 11, 12, 13};
        container.addAll(Arrays.asList(moreElems));

        Collections.addAll(container, 14, 15, 16, 17);
        Collections.addAll(container, moreElems);

        java.util.List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.set(1, 99);
//        list.remove(2);

        System.out.println(container);
        System.out.println(list);

    }
}
