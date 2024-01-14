package Interface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Inter> participents = new ArrayList<>();
        Bat c = new Bat();
        Dog d = new Dog();
        participents.add(d);
        for(Inter a : participents){
            a.run();
        }
    }
}
