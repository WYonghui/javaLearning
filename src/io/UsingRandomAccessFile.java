package io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;

/**
 * Created by 10564 on 2017-10-31.
 */
public class UsingRandomAccessFile {
    private static String file = "aaa.txt";
    private static void display(){
        RandomAccessFile in;
        try {
            in = new RandomAccessFile(file, "r");
            PrintStream p = System.out;
            p.println(in.readBoolean());
            p.println(in.readByte());

            int n = in.readInt();
            for (int i = 0; i < n; i++) {
                p.print((char)in.readByte());
            }
            p.println();

            p.println(in.readChar());
            p.println(in.readDouble());
            p.println(in.readFloat());
            p.println(in.readInt());
            p.println(in.readLong());
            p.println(in.readShort());
            p.println(in.readUTF());

            in.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        RandomAccessFile rf;

        try {
            rf = new RandomAccessFile(file, "rw");
            rf.writeBoolean(true);
            rf.writeByte(12);

            String s = "thie is a message.";
            rf.writeInt(s.length());
            rf.writeBytes(s);
//            rf.writeBytes("this is a message.");

            rf.writeChar('3');
//            rf.writeChars("this is the second message.中");
            rf.writeDouble(1.12321);
            rf.writeFloat(0.332F);
            rf.writeInt(12);
            rf.writeLong(2333);
            rf.writeShort(99);
            rf.writeUTF("this is the third message.");
            rf.close();
            display();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
