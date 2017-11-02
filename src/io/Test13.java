package io;

import java.io.*;

/**
 * Created by 10564 on 2017-10-31.
 */
public class Test13 {

    public static void main(String[] args) {
        LineNumberReader reader;
        PrintWriter writer;
        try {
            reader = new LineNumberReader(new BufferedReader(new FileReader("./src/io/Test13.java")));
            writer = new PrintWriter("Test13.out");

            int n = reader.getLineNumber();

            String s;
            while ((s=reader.readLine()) != null){
                writer.println(reader.getLineNumber() + ": " + s);
            }

            reader.close();
            writer.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
