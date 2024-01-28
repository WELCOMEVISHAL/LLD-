package producerConsumerSemaphores;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
    public int maxSelfs;
    private ConcurrentLinkedQueue<Object> items;

    public Store(int maxSelfs) {
        this.maxSelfs = maxSelfs;
        items = new ConcurrentLinkedQueue<>();
    }

    public int getMaxSelfs(){
        return maxSelfs;
    }

    public ConcurrentLinkedQueue<Object> getItems(){
        return items;
    }

    public void addItem(){
        System.out.println("Producer size is :"+this.items.size());
        this.items.add(new Object());
    }

    public void removeItem(){
        System.out.println("Consumer size is :"+this.items.size());
        this.items.remove();
    }

}
