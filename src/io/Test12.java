package io;

import java.io.*;
import java.util.LinkedList;

/**
 * Created by 10564 on 2017-10-31.
 */
public class Test12 {

    public static void main(String[] args) {
        BufferedReader reader;
        PrintWriter writer;
        try {
            reader = new BufferedReader(new FileReader("./src/io/Test12.java"));
            LinkedList<String> list = new LinkedList<>();

            String s;
            while ((s = reader.readLine()) != null){
                list.add(s);
            }

            reader.close();

            writer = new PrintWriter(new BufferedWriter(new FileWriter("Test12.out")));

            int index = 0;
            while (index < list.size()){
                writer.println(++index + ": " + list.get(index-1));
            }
            writer.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
