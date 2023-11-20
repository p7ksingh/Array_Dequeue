package DequeDemo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
//rempveFirstOccurence and removeLastOccurence method
public class DequeMain {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        dq.add("AAA");
        dq.add("BBB");
        dq.add("CCCC");
        dq.add("DDD");
        dq.add("EEE");
        dq.add("BBB");
        dq.add("BBB");
        dq.add("FFF");
        System.out.println(dq);
        System.out.println(dq.removeFirstOccurrence("BBB"));
        System.out.println(dq);
        System.out.println(dq.removeFirstOccurrence("XXX"));
        System.out.println(dq.removeLastOccurrence("BBB"));
        System.out.println(dq);
        
    }
}
