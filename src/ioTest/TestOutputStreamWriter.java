package ioTest;

import java.io.*;

/**
 * Created by 10564 on 2017-10-16.
 */
public class TestOutputStreamWriter {

    public static void main(String[] args) {

        OutputStreamWriter out;
        try
        {
            out = new OutputStreamWriter(new FileOutputStream("out.txt"));

            out.write("huazhong University.");
            out.flush();
            out.close();

            out = new OutputStreamWriter(new FileOutputStream("out.txt", true));
            out.write("huazhong Uni 华中");
            out.write(System.getProperty("line.separator"));
            out.write("湖北省武汉市");
            out.flush();
            out.close();

            InputStreamReader reader = new InputStreamReader(new FileInputStream("out.txt"));

            int c;
            while((c=reader.read()) != -1){
                System.out.print((char)c);
            }

            reader.close();


        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
