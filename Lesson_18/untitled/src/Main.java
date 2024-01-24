import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {
    public static void main(String[] args) {


        PriorityBlockingQueue<Integer> queue=new PriorityBlockingQueue<>();
        queue.add(5);
        queue.add(3);
        queue.add(8);
        queue.add(8);
        System.out.println(queue.stream().findAny());






    }


}
