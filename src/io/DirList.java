package io;


import holding.TextFile;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * Created by 10564 on 2017-10-22.
 */
public class DirList {

    public static void main(String[] args) {
        String path = "./A";
        File file = new File(path);
        String[] list;

        if (args.length > 0)
            list = file.list(new DirFilter(args[0]));
        else list = file.list();

        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list){
            System.out.println(dirItem);
        }

    }


    static class DirFilter implements FilenameFilter{
        private String regex;

        public DirFilter(String regex) {
            this.regex = regex;
        }

        @Override
        public boolean accept(File dir, String name) {
            String re = TextFile.read(dir +"/"+ name);
            return ((re!=null && re.contains(regex)));
        }
    }
}
