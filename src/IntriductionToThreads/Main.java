package IntriductionToThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
//        HelloWordPrinter hw = new HelloWordPrinter();
////        hw.run();
////        hw.doSomething();
//        Thread t = new Thread(hw);
//        t.start();
//        System.out.println("Current Thread: " + Thread.currentThread().getName());

        //ExecutorService es = Executors.newFixedThreadPool(4020);
        ExecutorService es = Executors.newCachedThreadPool();
        for(int i = 0;i <= 1000000;i++){
            if(i == 80){
                System.out.println("hey");
            }
            Runnable pn = new PrintNumber(i);
            es.execute(pn);
//            Thread t1 = new Thread(pn);
//            t1.start();
        }
    }

}
