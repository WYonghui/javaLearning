package holding;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by 10564 on 2017-10-14.
 */
public class test18 {

    public static void main(String[] args) {
        Map<String ,Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("seven", 7);
        hashMap.put("three", 3);
        hashMap.put("five", 5);
        hashMap.put("ten", 10);

        System.out.println(hashMap);

        Map<String ,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);

        Map<String ,Integer> linkedHashMap = new LinkedHashMap<>(treeMap);
        System.out.println(linkedHashMap);

        Map<String ,Integer> linkedHashMap2 = new LinkedHashMap<>(hashMap);
        System.out.println(linkedHashMap2);

    }
}
