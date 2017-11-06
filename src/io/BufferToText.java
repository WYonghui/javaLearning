package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/**
 * Created by 10564 on 2017-11-06.
 */
public class BufferToText {

    private static int MAXSIZE = 1024;
    //转换数据
    public static void main(String[] args) throws Exception{
        ByteBuffer bbf = ByteBuffer.allocate(MAXSIZE);
        FileChannel fChannel = null;

        fChannel = new FileOutputStream("aaa.txt").getChannel();
        fChannel.write(ByteBuffer.wrap("Some text".getBytes()));
        fChannel.close();

        fChannel = new FileInputStream("aaa.txt").getChannel();
        fChannel.read(bbf);
        bbf.flip();
        System.out.println(bbf);
        bbf.rewind();
        System.out.println(bbf.asCharBuffer());

        bbf.rewind();
        for (int i = 0; i < bbf.limit(); i++) {
            System.out.print((char)bbf.get());
        }
        System.out.println();

        bbf.rewind();
        String encoding = System.getProperty("file.encoding");
        System.out.println("Decoded using " + encoding + ": " + Charset.forName(encoding).decode(bbf));
        fChannel.close();

        fChannel = new FileOutputStream("aaa.txt").getChannel();
        fChannel.write(ByteBuffer.wrap("Some text".getBytes("UTF-16BE")));
        fChannel.close();

        fChannel = new FileInputStream("aaa.txt").getChannel();
        bbf.clear();
        fChannel.read(bbf);
        bbf.flip();
        System.out.println(bbf.asCharBuffer());
        fChannel.close();

        fChannel = new FileOutputStream("aaa.txt").getChannel();
        bbf = ByteBuffer.allocate(24);
        bbf.asCharBuffer().put("Some text");
        fChannel.write(bbf);
        fChannel.close();

        fChannel = new FileInputStream("aaa.txt").getChannel();
        fChannel.read(bbf);
        bbf.flip();
        System.out.println(bbf.asCharBuffer());
        fChannel.close();

    }
}
