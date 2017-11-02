package stringTest;

/**
 * Created by 10564 on 2017-10-10.
 */
public class SpiltTest {

    public static void main(String[] args) {
        String str = new String("AbcdDsjfS,diw32n14Newi1sdf9nNdeiIIlFF");

        String[] s1 = str.split("[A-Z]");
        String[] s2 = str.split("[a-z]+");

        System.out.println("字符个数：" + str.length());
        System.out.println("大写字母出现次数：" + s1.length);
        System.out.println("小写字母出现次数：" + s2.length);
        System.out.println("非字母字符出现次数：" + (str.length()-s1.length-s2.length));

    }
}
