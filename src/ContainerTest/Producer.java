package ContainerTest;

/**
 * Created by 10564 on 2017-10-11.
 */
public class Producer {
    private String[] strs = new String[]{"sdlfas", "ddiws", "lsix", "suejx", "suejx"};
    private int index = 0;

    public String next(){

        if (index < strs.length) return strs[index++];
        else return null;
    }
}
