package io;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by 10564 on 2017-10-22.
 */
public class Test7 {

    public static void main(String[] args) {

        String path;

        if (args.length > 0)
            path = args[0];
        else path = "./A/D.txt";
        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            InputStreamReader reader = new InputStreamReader(new FileInputStream(path), "GBK");
            BufferedReader bufferedReader = new BufferedReader(reader);

//            LinkedList<String> list = new LinkedList<>();
            ArrayList<String> arrayList = new ArrayList<>();

            String str;
            while ((str = bufferedReader.readLine()) != null){
//                list.add(str);
                arrayList.add(str.toUpperCase());
            }

            PrintStream printStream = System.out;

            for (String s : arrayList){
                printStream.append(s);
                printStream.println();
            }

            printStream.println();
//            for (int i = list.size()-1; i >= 0 ; i--) {
//                System.out.println(list.get(i));
//            }

        }catch (IOException e){
            e.printStackTrace();
        }



    }
}
