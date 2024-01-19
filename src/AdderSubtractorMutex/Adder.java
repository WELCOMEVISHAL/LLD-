package AdderSubtractorMutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value v;
    private Lock l;
    Adder(Value v, Lock l) {
        this.v = v;
        this.l = l;
    }

    public Void call() throws Exception{
        for(int i = 0;i < 100;i++){

            l.lock();
            System.out.println("Lock acquired by add "+i);

            this.v.val +=1;
            l.unlock();
        }
        return null;
    }
}
