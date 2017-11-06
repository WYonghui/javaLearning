package io;

import java.nio.ByteBuffer;

/**
 * Created by 10564 on 2017-11-06.
 */
public class GetData {
    private static int MAXSIZE = 1024;
    public static void main(String[] args) {

        ByteBuffer bbf = ByteBuffer.allocate(MAXSIZE);

        bbf.asCharBuffer().put("Some text");
        System.out.println(bbf.getChar(4));  //此处index只能是偶数，因为每个字符占两个字节，而ByteBuffer以字节为单位

        bbf.rewind();
        bbf.asShortBuffer().put((short)1221);
        System.out.println(bbf.getShort());

        bbf.rewind();
        bbf.asDoubleBuffer().put(12.54784844574115);
        System.out.println(bbf.getDouble());
    }
}
