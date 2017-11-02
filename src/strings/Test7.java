package strings;

import java.util.regex.Pattern;

/**
 * Created by 10564 on 2017-10-24.
 */
public class Test7 {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("\\p{Upper}.*?\\.");
        System.out.println(pattern.matcher("Wang yong.hui.").matches());
        System.out.println(pattern.matcher("Huazhong University,").matches());
    }

}
