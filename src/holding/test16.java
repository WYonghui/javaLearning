package holding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by 10564 on 2017-10-14.
 */
public class test16 {

    public static void main(String[] args) {
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'o', 'e', 'o', 'y', 'i'));

        String[] strs = TextFile.read("aaa.txt").split("\\W+");

        int total = 0;
        int num;
        for (String str : strs){
            num = 0;
            for (int i = 0; i < str.length(); i++) {
                if (set.contains(str.charAt(i))) num ++;
            }
            System.out.println(str + " : " + num);
            total += num;
        }
        System.out.println("total num : " + total);

    }
}
