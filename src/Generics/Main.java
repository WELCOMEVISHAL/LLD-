package Generics;

import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void  main(String[] args){
        pair<String, Integer> p = new pair<>();
        //p.setX(10);
        //p.setY(10);

        pair.doSomething("abc",10);

        pair p1 = new pair();
        p1.setY("abc");
        p1.setY(01);


        System.out.println("Debug");


    }
}
