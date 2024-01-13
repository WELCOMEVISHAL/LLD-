package inheritance;

public class Main {
    public static void main(String[] args){
        Students s = new Students();
        s.doSomething();
        System.out.println(s);

        //Polymorphism
        User s2 = new Students();
        //s2.doSomething(); //Compilation error
        s2.age = 30;

        //Method overloading
        C c = new C("a");
        c.doSomething();
        c.doSomething("I am string");
        c.doSomething(10,"I am string");
        c.doSomething("I am string ",10);

        D d = new D();
        d.doSomething();

        E e = new E();
        e.doSomething();  //d's do Something

        C c1 = new D();
        c1.doSomething();
    }
}
