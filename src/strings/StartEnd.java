package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 10564 on 2017-10-26.
 */
public class StartEnd {

    public static String input =
            "As long as there is injustice, whenever a\n" +
                    "Targathian baby cries out, wherever a distress\n" +
                    "signal sounds among the stars ... We'll be there.\n" +
                    "this fine ship, and this fine crew ...\n" +
                    "Never give up! Never surrender!";

    private static class Display {
        private boolean regexPrinted = false;
        private String regex;
        public Display(String regex) {
            this.regex = regex;
        }

        public void display(String message){
            if (!regexPrinted){
                System.out.println(regex);
                regexPrinted = true;
            }
            System.out.println(message);
        }

    }

    public static void examine(String str, String regex){
        Display d = new Display(regex);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()){
            d.display("find() \"" + matcher.group() + "\" start = " + matcher.start() + " end = " + matcher.end());
        }

        if (matcher.lookingAt()){
            d.display("lookingAt() \"" + matcher.group() + "\" start = " + matcher.start() + " end = " + matcher.end());
        }

        if (matcher.matches()){
            d.display("matches() \"" + matcher.group() + "\" start = " + matcher.start() + " end = " + matcher.end());
        }

    }

    public static void main(String[] args) {
        String[] strings = Groups.poem.split("\n");
//        String[] strings = input.split("\n");
        for (String str : strings){
            System.out.println("input : " + str);
            for (String regex: new String[]{"\\w*ere\\w*", "\\w*ever", "T\\w+", "Never.*?!", "T\\w+.*?\\."}){
                examine(str, regex);
            }
        }
    }
}
