package strings;

/**
 * Created by 10564 on 2017-10-24.
 */
public class Test9 {

    public static void main(String[] args) {
        String str = Splitting.knights;
        System.out.println(str.replaceAll("[aeiouAEIOU]", "_"));
    }
}
