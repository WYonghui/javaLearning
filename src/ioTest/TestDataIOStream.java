package ioTest;

import java.io.*;

/**
 * Created by 10564 on 2017-10-16.
 */
public class TestDataIOStream {

    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);

        try{
            dataOutputStream.writeDouble(0.23455341233424);
            dataOutputStream.writeBoolean(true);

            dataOutputStream.close();
            byteArrayOutputStream.close();

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);

            System.out.println(dataInputStream.available());
            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readBoolean());
            dataInputStream.close();
            byteArrayInputStream.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
