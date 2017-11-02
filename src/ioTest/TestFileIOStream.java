package ioTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by 10564 on 2017-10-16.
 */
public class TestFileIOStream {

    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("src/ContainerTest/TestSet.java");
            out = new FileOutputStream("out.java");

            int c;
            while ((c = in.read()) != -1){
                System.out.print((char)c);
                out.write(c);
            }

            in.close();
            out.close();
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("------------- The end ---------------");
    }
}
