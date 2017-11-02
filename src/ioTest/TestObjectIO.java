package ioTest;

import java.io.*;

/**
 * Created by 10564 on 2017-10-22.
 */
public class TestObjectIO {

    public static void main(String[] args) {
        T t = new T();
        t.d = 8;

        try{
            FileOutputStream fos = new FileOutputStream("out.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(t);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("out.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            T t1 = (T)ois.readObject();
            ois.close();

            System.out.println(t1.a +" " + t1.b + " " + t1.c + " " + t1.d);

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }


    }


    private static class T implements Serializable
    {
        int a = 10;
        int b = 6;
        double c = 2.4;
        transient long d = 3;
    }
}
