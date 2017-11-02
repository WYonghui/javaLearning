package strings;

import holding.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 10564 on 2017-10-30.
 */
public class JGrep {

    public static void main(String[] args) {

        if (args.length < 2){
            System.out.println("Usage: java JGep file regex [pattern]");
            System.exit(0);
        }

        Pattern p;
        if (args.length == 2)
            p = Pattern.compile(args[1]);
        else{
            int m = -1;
            switch (args[2]){
                case "Pattern.CASE_INSENSITIVE":
                    m = Pattern.CASE_INSENSITIVE;
                    break;
                case "Pattern.MULTILINE":
                    m = Pattern.MULTILINE;
                    break;
            }
            p = Pattern.compile(args[1], m);

        }
//        Pattern p = Pattern.compile("\\b[sSct]\\w+");

        Matcher m = p.matcher("");
        int index = 0;

//        m.reset(" school ");
//        System.out.println(m.find());

        for (String s : new TextFile(args[0])){
            m.reset(s);
            while (m.find()){
                System.out.println(++index + ": " + m.group() + " " + m.start());
            }
        }

    }

}
