package ContainerTest;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by 10564 on 2017-10-11.
 */
public class TestArrayList {

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        gerbils.add(new Gerbil());
        gerbils.add(new Gerbil());

        System.out.println(gerbils);

        Iterator<Gerbil> it = gerbils.iterator();
        Gerbil g;
        while (it.hasNext()){
            g = it.next();
            g.hop();
            it.remove();
        }

//        Gerbil g;
//        for (int i = 0; i < 2; i++) {
//            g = gerbils.get(i);
//            g.hop();
//        }

//        for (Gerbil g: gerbils){
//            g.hop();
//            gerbils.remove(g);
//        }
        System.out.println(gerbils);
    }
}
