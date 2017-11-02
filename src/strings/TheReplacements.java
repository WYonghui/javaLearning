package strings;

import holding.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 10564 on 2017-10-26.
 */

/*! Here's a block of text to use as input to
    the regular expression matcher. Note that we'll
    first extract the block of text by looking for
    the special delimiters, then process the extracted block.
!*/
public class TheReplacements {

    public static void main(String[] args) {
        String s = TextFile.read("./src/strings/TheReplacements.java");
//        String s = TextFile.read("./out.java");

        Matcher matcher = Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL).matcher(s);
        if (matcher.find()){
            s = matcher.group(1);
        }

        s = s.replaceAll(" {2,}", " ");  //将两个及以上的空格用一个空格代替
        s = s.replaceAll("(?m)^ +", ""); //去除每行行首的空格
        System.out.println(s);

        s= s.replaceFirst("[aeiou]", "(VOWEL1)");

        StringBuffer sbuf = new StringBuffer();
        matcher = Pattern.compile("[aeiou]").matcher(s);
        while (matcher.find()){
            matcher.appendReplacement(sbuf, matcher.group().toUpperCase());
//            s = s.replaceFirst("[aeiou]", matcher.group().toUpperCase());
        }
        matcher.appendTail(sbuf);
        System.out.println(sbuf);
//        System.out.println(s);

    }


}
