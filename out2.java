package ContainerTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by 10564 on 2017-10-12.
 */
public class TestSet {

    public static void main(String[] args) {
        Set s1 = new HashSet<>();
        Set s2 = new HashSet<>(Arrays.asList("a", "d", "b"));
        s1.add("a"); s1.add("b"); s1.add("c");

        Set s3 = new HashSet<>(s1);
        s3.retainAll(s2);
        System.out.println(s3);

        Set s4 = new HashSet<>(s2);
        s4.addAll(s1);
        System.out.println(s4);

//        System.out.println(s1);
        System.out.println("测试中文");
    }
}
