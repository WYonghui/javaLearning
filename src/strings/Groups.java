package strings;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 10564 on 2017-10-26.
 */
public class Groups {

    public static final String poem =
            "Twas briling, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnach.";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(?m)((\\S+)\\s+(\\S+)\\s+(\\S+))$");
//        Pattern pattern = Pattern.compile("(^|\\s)[a-z][\\w&&\\D]*\\b");
        Matcher matcher = pattern.matcher(poem);

//        HashMap<String, Integer> hashMap = new HashMap<>();

        while (matcher.find()){
//            String m = matcher.group();
//            if (hashMap.containsKey(m)){
//                hashMap.put(m, hashMap.get(m)+1);
//            }
//            else
//                hashMap.put(m, 1);
            System.out.println("matched string : "+ matcher.group());
            for (int i = 0; i < matcher.groupCount(); i++) {
                System.out.print("[" + matcher.group(i) + "]");
            }
            System.out.println();
        }

//        System.out.println(hashMap.toString());
    }
}
