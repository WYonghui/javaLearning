package strings;

import holding.TextFile;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 10564 on 2017-10-30.
 */
public class Test19 {

    public static void main(String[] args) {

        if (args.length < 1){

            System.exit(0);
        }

        StringBuilder stringBuilder = new StringBuilder();

        String f = TextFile.read(args[0]);
        Pattern pattern = Pattern.compile("((^|\\t+| +)/\\*.*?\\*/)|((^|\\t+| +)//.*?$)",
                Pattern.DOTALL | Pattern.MULTILINE);  //去除注释

        Matcher matcher = pattern.matcher(f);
        int start = 0;
        int end = 0;
        while (matcher.find()){
            end = matcher.start()-1;
            if (start < end)
                stringBuilder.append(f.substring(start, end));
            start = matcher.end();
        }
        end = f.length()-1;
        stringBuilder.append(f.substring(start, end));
        f = stringBuilder.toString();
        stringBuilder.delete(0, stringBuilder.length());

        pattern = Pattern.compile("\"(.*?)\"");  //去除普通字符串
        matcher = pattern.matcher(f);
        start = 0;
        end = 0;
        while (matcher.find()){
            end = matcher.start()-1;
            if (start < end) stringBuilder.append(f.substring(start, end));
            start = matcher.end();
        }
        end = f.length();
        stringBuilder.append(f.substring(start, end));

        pattern = Pattern.compile("\\b[A-Z]\\w+");
        matcher = pattern.matcher(stringBuilder.toString());

        HashSet<String> hashSet = new HashSet<>();
        while (matcher.find()){
            hashSet.add(matcher.group());
        }

        System.out.println(hashSet);

    }
}
