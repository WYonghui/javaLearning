package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 10564 on 2017-10-26.
 */
public class Test11 {

    public static void main(String[] args) {
        String str = "Arline ate eight apples and one orange while Anita hadn't any";
        String regex = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        System.out.println("matches : " + matcher.matches());

        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }
    }

}
