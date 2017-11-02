package fileTest;


import java.io.File;

/**
 * Created by 10564 on 2017-10-10.
 */
public class ShowDir {

    public enum Color{red, yellow, blue, black}

    public static void main(String[] args) {
        Color c = Color.red;

        System.out.println(c);

        String path = "A";
        File file = new File(path);
        ShowDir sd = new ShowDir();

        if (file.exists())
            sd.showDir(file, 0);
        else
            System.out.println(path + " is not exist!");

    }

    public void showDir(File file, int depth){

        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
        System.out.println(file.getName());

        if (file.isDirectory()) {
            File f;
            File[] subFiles = file.listFiles();
            for (int i = 0; i < subFiles.length; i++) {
                showDir(subFiles[i], depth+1);
            }
        }

    }
}
