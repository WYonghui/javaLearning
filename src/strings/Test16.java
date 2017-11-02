package strings;

import holding.TextFile;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 10564 on 2017-10-30.
 */
public class Test16 {

    public static void main(String[] args) {

        if (args.length < 2){
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }

        File file = new File(args[0]);
        File[] files = null;
        if (file.isDirectory()){
            files = file.listFiles();
            for (File f: files){
                if (f.isFile())
                {
                    System.out.println("======================" + f.getName() + "==========================");
                    jgrep(f.getAbsolutePath(), args[1]);
                }
            }
        }else if (file.isFile()){
            jgrep(file.getAbsolutePath(), args[1]);
        }

    }

    private static void jgrep(String path, String regex){
        Pattern p = Pattern.compile(regex);

        Matcher matcher = p.matcher("");
        int index = 0;

        for (String s: new TextFile(path)){
            matcher.reset(s);
            while (matcher.find()){
                System.out.println(++index + ": " + matcher.group() + " " + matcher.start());
            }
        }
    }
}
