package IntriductionToThreads;

public class PrintNumber implements Runnable{
    private int num;
    PrintNumber(int Number){
        this.num = Number;
    }
    public void run(){
        System.out.println("Printing Number "+ Thread.currentThread().getName());

    }
}
