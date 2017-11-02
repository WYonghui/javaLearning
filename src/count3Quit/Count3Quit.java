package count3Quit;

/**
 * Created by 10564 on 2017-10-09.
 */
public class Count3Quit {

    public static void main(String[] args) {
        int[] circle = new int[500];

        //使用数组实现循环链表
        for (int i = 0; i < 499; i++) {
            circle[i] = i+1;
        }
        circle[499] = 0;

        int left = 500;
        int count = 0;
        int index = 0;

        while (left > 1){
            count++;
            if (count == 2){ //提前判断
                count = 0;
                circle[index] = circle[circle[index]];
                left--;
            }

            index = circle[index];
        }

        System.out.println(index);
    }




}
