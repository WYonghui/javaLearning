package ioTest;

import java.io.*;

/**
 * Created by 10564 on 2017-10-16.
 */
public class TestMark {

    public static void main(String[] args) {
        FileInputStream in = null;
        BufferedInputStream bin;
        FileOutputStream out = null;
        try{
            File file = new File("out.txt");
            file.delete();
            out = new FileOutputStream("out.txt");

            for (int i = 0; i < 200; i++) {
                out.write((char)i);
            }
            out.flush();
            out.close();

            in = new FileInputStream("out.txt");
            bin = new BufferedInputStream(in);
            System.out.println(bin.read());
            System.out.println(bin.read());

            if (bin.markSupported()){
                bin.mark(100);
                System.out.println(bin.read());
                bin.reset();
            }

            System.out.println(bin.read());
            bin.close();
            in.close();

            in = new FileInputStream("out.txt");
            bin = new BufferedInputStream(in);
            System.out.println(bin.read());
            System.out.println(bin.read());
            System.out.println(bin.read());
            bin.mark(100);
            for (int i = 0; i < 154; i++) {
                bin.read();
            }
            System.out.println(bin.read());
            bin.reset();
            System.out.println(bin.read());

            bin.close();
            in.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
