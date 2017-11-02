package holding;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by 10564 on 2017-10-12.
 */
public class Stack<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void push(T v){list.addFirst(v);}
    public T pop(){return list.removeFirst();}
    public T peek(){return list.getFirst();}
    public boolean empty(){return list.isEmpty();}
    public String toString(){return list.toString();}
}
