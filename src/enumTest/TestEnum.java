package enumTest;

/**
 * Created by 10564 on 2017-10-11.
 */
public class TestEnum {
    public enum Money {ONE_JIAO, FIVE_JIAO, ONE_YUAN, FIVE_YUAN, TEN_YUAN, FIFTY_YUAN}

    public static void main(String[] args) {
        for(Money m : Money.values()){
            System.out.println(m + ", ordinal " + m.ordinal());
        }

        Money m1 = Money.ONE_JIAO;
        Money m2 = Money.FIFTY_YUAN;
        describe(m1);
        describe(m2);
    }

    public static void describe(Money m){
        switch (m){
            case ONE_JIAO:
                System.out.println("1角钱");
                break;
            case FIVE_JIAO:
                System.out.println("5角钱");
                break;
            case ONE_YUAN:
                System.out.println("1元钱");
                break;
            case FIVE_YUAN:
                System.out.println("5元钱");
                break;
            case TEN_YUAN:
                System.out.println("10元钱");
                break;
            case FIFTY_YUAN:
                System.out.println("50元钱");
                break;
            default:
                System.out.println("无这种面值");
        }
    }
}
