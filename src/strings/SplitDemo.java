package strings;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 10564 on 2017-10-26.
 */
public class SplitDemo {

    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";

        Pattern pattern = Pattern.compile("!!");
        System.out.println(Arrays.toString(pattern.split(input)));
        System.out.println(Arrays.toString(pattern.split(input, 3)));

        System.out.println(Arrays.toString(input.split("!!")));
        System.out.println(Arrays.toString(input.split("!!", 3)));
    }
}
