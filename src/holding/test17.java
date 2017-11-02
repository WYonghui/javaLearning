package holding;

import ContainerTest.Gerbil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by 10564 on 2017-10-14.
 */
public class test17 {

    public static void main(String[] args) {
        Map<String, Gerbil> map = new HashMap<>();
        init(map);

        Iterator<String> it = map.keySet().iterator();
        String gName;
        while(it.hasNext()){
            gName = it.next();
            System.out.print(gName + " ");
            map.get(gName).hop();
        }
    }

    private static void init(Map<String, Gerbil> map){
        Gerbil g;

        for (int i = 0; i < 5; i++) {
            g = new Gerbil();
            map.put(g.toString(), g);
        }
    }
}
