package ioTest;

import io.BufferedInputFile;

import java.io.*;

/**
 * Created by 10564 on 2017-10-24.
 */
public class FormattedMemoryInput {

    public static void main(String[] args) {

//        try {
//            DataOutputStream dos = new DataOutputStream(new FileOutputStream("out5", false));
//
//            dos.writeInt(123);
//            dos.writeDouble(3.1415D);
//            Long l = 68L;
//            dos.writeLong(l);
//
//            dos.flush();
//            dos.close();
//        } catch (FileNotFoundException e){
//            e.printStackTrace();
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//
//        try {
//            DataInputStream dis = new DataInputStream(new FileInputStream("out5"));
////        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read("out5").getBytes()));
//
//            System.out.println(dis.readInt());
//            System.out.println(dis.readDouble());
//            System.out.println(dis.readLong());
//        } catch (FileNotFoundException e){
//            e.printStackTrace();
//        } catch (IOException e){
//            e.printStackTrace();
//        }

        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read("aaa.txt").getBytes()));

        try {
            while (dis.available() != 0){
                char c = (char)dis.readByte();
//                char c = dis.readChar();
                if (c == (new String("\n").charAt(0)))
                {
                    System.out.println();
                    continue;
                }
                System.out.print(c);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
