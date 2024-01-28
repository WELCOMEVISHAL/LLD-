package producerConsumerSemaphores;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Store store;
    private Semaphore pSema, cSema;
    Producer(Store st, Semaphore producerSema, Semaphore consumerSema){
        this.pSema = producerSema;
        this.cSema = consumerSema;
        this.store = st;
    }
//    Producer(Store st){
//        this.store = st;
//    }

    public void run(){
        while(true){
            try {
                this.pSema.acquire();
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.addItem();
            this.cSema.release();
        }
    }
}
