package fileTest;

import java.io.File;
import java.io.IOException;

/**
 * Created by 10564 on 2017-10-10.
 */
public class TestFile {

    public static void main(String[] args) {
        String separator = File.separator;
        String path = "mydec1" + separator + "mydec2";
        String fName = "myfile.txt";
        File file = new File(path, fName);

        if (file.exists()){
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getName());
            System.out.println(file.length());
        }else {
            try {
                file.getParentFile().mkdirs();
                if (!file.createNewFile())
                    System.out.println("Create file" + fName + "failed!");
                System.out.println(file.canRead());
                System.out.println(file.canWrite());
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
