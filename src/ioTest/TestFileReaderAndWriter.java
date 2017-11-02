package ioTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by 10564 on 2017-10-16.
 */
public class TestFileReaderAndWriter {

    public static void main(String[] args) {
        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader("src/ContainerTest/TestSet.java");
            writer = new FileWriter("out2.java");

            int c;
            while((c = reader.read()) != -1){
                System.out.print((char)c);
                writer.write(c);
            }

            reader.close();
            writer.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
