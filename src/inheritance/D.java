package inheritance;

public class D extends C{
    D(){
        super("My Parent is C");
        System.out.println("D");
    }

    //Overriding
    public void doSomething(double c){
        System.out.println("Class D's do Something");
    }

    //error: as signature change
//    void doSomething(double c){
//        System.out.println("Class D's do Something");
//    }
}
