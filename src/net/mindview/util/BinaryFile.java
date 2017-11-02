package net.mindview.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by 10564 on 2017-11-02.
 */
public class BinaryFile {
  //读取二进制文件，返回字节数组
    public static byte[] read(File file) throws IOException{
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
        byte[] bytes = null;

        bytes = new byte[in.available()];
        in.read(bytes);
        in.close();
        return  bytes;
    }

    public static byte[] read(String path) throws IOException{
        return read(new File(path));
    }

}
