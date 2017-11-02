package io;

import java.io.File;

/**
 * Created by 10564 on 2017-10-22.
 */
public class MakeDirectories {

    public static void main(String[] args) {
        File file = new File("./A/D.txt");
        show(file);
    }

    private static void show(File file){
        System.out.println(
                "Absolute path : " + file.getAbsolutePath()
                + "\ngetName : " + file.getName()
                + "\ngetParent : " + file.getParent()
                + "\ngetPath : " + file.getPath()
                + "\nlength : " + file.length()
                + "\nlastModified : " + file.lastModified()
        );
    }

}
