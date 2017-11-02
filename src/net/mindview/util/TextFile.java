package net.mindview.util;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 10564 on 2017-10-31.
 */
public class TextFile extends ArrayList<String> {

    public static String read(String fileName) throws IOException{

        StringBuilder sb = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String s;
        while ((s=reader.readLine())!=null){
            sb.append(s + "\n");
        }
        reader.close();

        return sb.toString();
    }

    public static void write(String fileName, String text){
        PrintWriter writer;
        try {
            writer = new PrintWriter(fileName);
            writer.print(text);
            writer.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public TextFile(String path, String regex) throws IOException{
        super(Arrays.asList(read(path).split(regex)));
        if (get(0)=="") remove(0);
    }

    public TextFile(String path) throws IOException{
        this(path, "\n");
    }

    public void write(String path){
        PrintWriter writer;

        try {
            writer = new PrintWriter(path);

            for (String item : this){
                writer.println(item);
            }
            writer.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
