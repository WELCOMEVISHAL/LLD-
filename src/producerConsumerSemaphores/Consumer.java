package producerConsumerSemaphores;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Store store;

    private Semaphore pSema,cSema;
    Consumer(Store st, Semaphore producerSema, Semaphore consumerSema){
        this.pSema = producerSema;
        this.cSema = consumerSema;
        this.store = st;
    }
    Consumer(Store st){
        this.store = st;
    }

    public void run(){
        while(true){
            try {
                this.cSema.acquire();
                Thread.sleep(20);
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
                store.removeItem();
                this.pSema.release();
            }
        }
    }
