package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * Created by 10564 on 2017-11-02.
 */
public class TransferTo {
    private static int BSIZE;

    public static void main(String[] args) {

        try {
            FileChannel in = new FileInputStream("out.java").getChannel();
            FileChannel out = new FileOutputStream("out2.java").getChannel();

            in.transferTo(0, in.size(), out);

            in.close();
            out.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
