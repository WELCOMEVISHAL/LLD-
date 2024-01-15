package IntriductionToThreads;

public class HelloWordPrinter implements Runnable{

    public void doSomething(){
        System.out.println("Helloword from: "+ Thread.currentThread().getName());
    }
    public void run(){
        System.out.println("Helloword from: "+ Thread.currentThread().getName());
        doSomething();
    }
}
