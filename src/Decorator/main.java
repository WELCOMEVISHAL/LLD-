package Decorator;

import Decorator.addons.Milk;
import Decorator.addons.Whip;

public class main {
    public static void main(String[] args){
        Beverage b = new Espresso();
        b = new Milk(b);
        b = new Whip(b);

        Beverage b2 = new Espresso();
        b2 = new Whip(b2);

        System.out.println(b.getPrice());
    }
}
