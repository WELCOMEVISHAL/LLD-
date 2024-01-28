package producerConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Store {
    public int maxSelfs;
    private List<Object> items;

    public Store(int maxSelfs) {
        this.maxSelfs = maxSelfs;
        items = new ArrayList<>();
    }

    public int getMaxSelfs(){
        return maxSelfs;
    }

    public List<Object> getItems(){
        return items;
    }

    public void addItem(){
        System.out.println("Producer size is :"+this.items.size());
        this.items.add(new Object());
    }

    public void removeItem(){
        System.out.println("Consumer size is :"+this.items.size());
        this.items.remove(this.items.size()-1);
    }

}
