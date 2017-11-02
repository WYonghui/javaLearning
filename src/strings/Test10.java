package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 10564 on 2017-10-24.
 */
public class Test10 {

    public static void main(String[] args) {
        String str = "Java now has regular expressions";
        String[] regexs = {"^Java", "\\Breg.*", "n.w\\s+h(a|i)s", "s?", "s*", "s+", "s{4}", "s{1}", "s{0,3}"};

        for (String regex : regexs){
            Matcher matcher = Pattern.compile(regex).matcher(str);
            if (matcher.find()){
                System.out.print("regex \"" + regex + "\" is matched : ture");
                System.out.println(", \"" + matcher.group() + "\" " + matcher.start());
            }
            else
                System.out.println("regex \"" + regex + "\" is matched : false");
        }
    }
}
