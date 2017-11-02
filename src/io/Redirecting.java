package io;

import java.io.*;

/**
 * Created by 10564 on 2017-11-02.
 */
public class Redirecting {

    public static void main(String[] args) {
        PrintStream console = System.out;

        try {
            PrintStream out = new PrintStream("out5");
            InputStream in = new BufferedInputStream(new FileInputStream("out.java"));

            //重定向
            System.setIn(in);
            System.setOut(out);
            System.setErr(out);

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s;
            while ((s = reader.readLine()) != null){
                System.out.println(s);
            }

            in.close();
            out.close();
            reader.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            System.setOut(console);
        }
    }
}
