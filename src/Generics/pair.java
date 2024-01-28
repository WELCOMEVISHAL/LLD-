package Generics;

public class pair <V, S> {
    V x;
    S y;

    public void setX(V x){
        this.x = x;
    }

    public void setY(S y){
        this.y = y;
    }

    public S getY(){
        return y;
    }

    public static <s,v> void doSomething(v x, s Y){
        System.out.println("hey");
    }

    public <v,s> void doSomething2(v x, s Y){
        System.out.println("hey");
    }
}
