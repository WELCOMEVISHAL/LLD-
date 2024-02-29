package Decorator.addons;

import Decorator.Beverage;

public class Whip implements addon{
    Beverage b;
    public Whip(Beverage b){
        this.b = b;
    }
    @Override
    public int getPrice(){
        return 50 + b.getPrice();
    }
}
