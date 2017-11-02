package holding;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by 10564 on 2017-10-12.
 */
public class InsertLinkedList {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        ListIterator<Integer> lIt = list.listIterator();

        lIt.add(3);
//        lIt.next();
        lIt.add(2);
        lIt.previous();
        lIt.add(4);
        lIt.add(5);
        System.out.println(list);

        while (lIt.hasNext()) lIt.next();

        while (lIt.hasPrevious())
            System.out.print(lIt.previous() + " ");
        System.out.println();

    }
}
