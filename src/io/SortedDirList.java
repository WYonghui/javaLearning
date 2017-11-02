package io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/**
 * Created by 10564 on 2017-10-22.
 */
public class SortedDirList extends File{

    public static void main(String[] args) {

        String[] list1;
        String[] list2;
        SortedDirList dirList = new SortedDirList("./A");

        list1 = dirList.list();
        list2 = dirList.list(args[0]);

        for (String dir: list1) {
            System.out.println(dir);
        }

        System.out.println("===================================");

        for (String dir : list2){
            System.out.println(dir);
        }
    }

    public SortedDirList(String pathname) {
        super(pathname);
    }

    @Override
    public String[] list() {
        return super.list();
    }

    public String[] list(String regex) {
        Pattern pattern = Pattern.compile(regex);

        return super.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        });
    }
}
