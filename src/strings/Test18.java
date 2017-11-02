package strings;

import holding.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 10564 on 2017-10-30.
 */
public class Test18 {

    public static void main(String[] args) {
        if(args.length < 1){

            System.exit(0);
        }
        String test = "This is a message!";
        String f = TextFile.read(args[0]);
        Pattern p = Pattern.compile("\"(.*?)\"");
        Matcher matcher = p.matcher(f);
        int index = 0;
        while (matcher.find()){
            System.out.println(++index + ": " + matcher.group(1));
        }
    }
}
