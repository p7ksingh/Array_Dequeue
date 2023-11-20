package DequeDemo;

import java.util.ArrayDeque;
//ArrayDeque
//follow insertation order
//allow insertation order
//check hetroginous allow allow
// null element not allowed
public class ArrayDequeTest {
    public static void main(String[] args) {
     //   ArrayDeque<String> adq = new ArrayDeque<>();
     ArrayDeque adq = new ArrayDeque();
        adq.add("DDD");
        adq.add("CCC");
        adq.add("FFF");
        adq.add("AAA");
        adq.add("EEE");
        adq.add("BBB");
        adq.add("BBB");
        adq.add("111");
      //  adq.add(null); // not allow
        System.out.println(adq);

    }
}
