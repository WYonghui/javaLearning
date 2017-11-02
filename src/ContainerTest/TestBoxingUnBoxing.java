package ContainerTest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 10564 on 2017-10-15.
 */
public class TestBoxingUnBoxing {
//    private static final Integer ONE = new Integer(1);
    private static final Integer ONE = 1;

    public static void main(String[] args){
        Map<String, Integer> hashMap = new HashMap<>();
        for (String s : args){
//            Integer i = hashMap.get(s);
            int i = hashMap.get(s)==null ? 0 : hashMap.get(s);
//            hashMap.put(s, i==null ? ONE: (new Integer(i+1)));
            hashMap.put(s, i+1);
        }

        System.out.println(hashMap.size() + "个对象被加入到hashMap中");
        System.out.println(hashMap);
    }
}
