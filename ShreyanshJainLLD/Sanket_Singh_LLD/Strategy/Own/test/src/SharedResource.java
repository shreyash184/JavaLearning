import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {

    Queue<Integer> queue;
    Integer buffer;

    SharedResource(Integer capacity){
        this.buffer = capacity;
        queue =  new LinkedList<>();
    }

    public synchronized void produce(int item) throws Exception{
        while(queue.size() == buffer){
            System.out.println("Please wait the buffer is full");
            wait();
        }

        this.queue.add(item);
        System.out.println("the resource " + item + " is added");
        notify();
    }

    public synchronized void consume() throws  Exception{
        while(queue.isEmpty()){
            System.out.println("Please wait there is nothing to consume");
            wait();
        }
        int consumedItem = queue.peek();
        this.queue.poll();
        System.out.println("the resource " + consumedItem + " is consumed");
        notify();
    }
}
