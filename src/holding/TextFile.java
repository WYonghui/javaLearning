package holding;

/**
 * Created by 10564 on 2017-10-14.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class TextFile implements Iterable<String>{

    private BufferedReader bufferedReader = null;
    private ArrayList<String> arrayList = null;

    public TextFile(String fileName) {
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(fileName)));
            arrayList = new ArrayList<>();

            String str;
            while ((str=bufferedReader.readLine())!=null){
                arrayList.add(str);
            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public TextFile(){}

    /**
     *
     * @param fileName The full path of the target file
     * @return
     */
    public static String read(String fileName){

        StringBuilder sb = new StringBuilder();

        try {
            File file = new File(fileName);
            if (!file.isFile()) return null;
            BufferedReader in = new BufferedReader(new FileReader(new File(fileName).getAbsoluteFile()));

            String s;
            try {
                while( (s = in.readLine()) != null ){
                    sb.append(s);
                    sb.append("\n");
                }
            }finally{
                in.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }

    /**
     *
     * @param fileName The full path of the target file
     * @param text The content which is written to the target file
     */
    public static void write(String fileName, String text){
        try {
            File file = new File(fileName);
            if (!file.isFile()) return;
            PrintWriter out = new PrintWriter(new File(fileName).getAbsoluteFile());
            out.print(text);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Iterator<String> iterator() {
        return arrayList.iterator();
    }
}