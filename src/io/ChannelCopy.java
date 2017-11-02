package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by 10564 on 2017-11-02.
 */
public class ChannelCopy {
    private static int BSIZE = 1024;
    public static void main(String[] args) {

        try {
            FileChannel in = new FileInputStream("out.java").getChannel();
            FileChannel out = new FileOutputStream("out2.java").getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(BSIZE);

            while ((in.read(buffer)) != -1){
                buffer.flip();
                out.write(buffer);
                buffer.clear();
            }

            in.close();
            out.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
