package io;


import net.mindview.util.TextFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 10564 on 2017-11-02.
 */
public class Test17 {

    public static void main(String[] args) {
        String f;
        Map<Character, Integer> map = null;
        try {
            f= TextFile.read("./src/io/Test17.java");

            map = new HashMap<>();
            for (Character c : f.toCharArray()){
                if (map.containsKey(c)){
                    map.put(c, map.get(c)+1);
                }
                else {
                    map.put(c, 1);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(map);
    }
}
