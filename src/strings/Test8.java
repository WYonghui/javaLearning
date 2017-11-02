package strings;

import java.util.Arrays;

/**
 * Created by 10564 on 2017-10-24.
 */
public class Test8 {

    public static void main(String[] args) {
        String str = Splitting.knights;
        System.out.println(Arrays.toString(str.split("the|you")));
    }
}
