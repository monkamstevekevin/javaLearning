package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
     public static  void  show(){
         Queue<String> queue =  new ArrayDeque<>();

         queue.offer("a");
         queue.offer("b");
         queue.offer("c");

         System.out.println(queue);
     }

}
