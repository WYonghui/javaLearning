package io;

import java.io.PrintWriter;

/**
 * Created by 10564 on 2017-11-02.
 */
public class ChangeSystemOut {

    public static void main(String[] args) {
        PrintWriter printWriter = new PrintWriter(System.out, true);
        System.out.println("Hello World! 中国");
        printWriter.println("Hello World! 中国");
    }
}
