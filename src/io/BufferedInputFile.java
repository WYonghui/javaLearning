package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by 10564 on 2017-10-24.
 */
public class BufferedInputFile {

    public static String read(String fileName){

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);

            StringBuilder builder = new StringBuilder();
            String str;
            while((str = reader.readLine()) != null){
                builder.append(str);
                builder.append("\n");
            }

            reader.close();
            fileReader.close();
            return builder.toString();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(BufferedInputFile.read("aaa.txt"));
    }


}
