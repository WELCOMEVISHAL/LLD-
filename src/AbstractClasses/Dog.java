package AbstractClasses;

public class Dog extends Animal{
    static int y = 10;
    void eat(){
        System.out.println("eat");
    }

    static void doSomething(){
        System.out.println("Something");
    }
    Dog(){
        super("MY ");
        y += 1;
    }
}
