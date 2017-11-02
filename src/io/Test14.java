package io;

import java.io.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by 10564 on 2017-10-31.
 */
public class Test14 {

    private static void bufferedIO(){
        BufferedReader reader;
//        PrintWriter writer;
        BufferedWriter writer;

        try {
            reader = new BufferedReader(new FileReader("D:\\Applications\\VisualStudio.zip"));
//            writer = new PrintWriter(new BufferedWriter(new FileWriter("D:\\Applications\\VisualStudio3.zip")));
            writer = new BufferedWriter(new FileWriter("D:\\\\Applications\\\\VisualStudio3.zip"));

            long start = System.currentTimeMillis();
            String s;
            while ((s=reader.readLine()) != null){
                writer.write(s + "\n");
            }
            writer.close();
            reader.close();

            long end = System.currentTimeMillis();
            System.out.println("bufferedIO: " + (end-start)/1000 + "s.");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void unbufferedIO(){
        BufferedReader reader;
//        PrintWriter writer;
        FileWriter writer;
        try {
            reader = new BufferedReader(new FileReader("D:\\Applications\\VisualStudio2.zip"));
//            writer = new PrintWriter(new FileWriter("D:\\Applications\\VisualStudio4.zip"));
            writer  = new FileWriter("D:\\Applications\\VisualStudio4.zip");

            long start = System.currentTimeMillis();
            String s;
            while ((s=reader.readLine()) != null){
//                writer.println(s);
                writer.write(s + "\n");
            }
            writer.close();
            reader.close();

            long end = System.currentTimeMillis();
            System.out.println("unbufferedIO: " + (end-start)/1000 + "s.");

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        unbufferedIO();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        bufferedIO();

    }


}
