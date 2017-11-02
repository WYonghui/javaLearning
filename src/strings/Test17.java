package strings;

import holding.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 10564 on 2017-10-30.
 */
public class Test17 {

    public static void main(String[] args) {
        //测试注释
        if (args.length < 1){

            System.exit(0);
        }

        String f = TextFile.read(args[0]);

        Pattern pattern = Pattern.compile("((^|\\t+| +)/\\*.*?\\*/)|((^|\\t+| +)//.*?$)", Pattern.DOTALL | Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(f);
        int index = 0;

        while (matcher.find()){
            System.out.println(++index + ": \n" + matcher.group());
        }
    }
}
