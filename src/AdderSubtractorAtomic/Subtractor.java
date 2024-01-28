package AdderSubtractorAtomic;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {

    private Value v;
    private Lock l;
    Subtractor(Value v, Lock l){
        this.v = v;
        this.l = l;
    }

    public Void call() throws Exception{
        for(int i = 0;i < 100;i++){
            System.out.println("Lock acquired by Sub "+i);
            this.v.val.addAndGet(-1);
        }
        return null;
    }
}
