package AbstractClasses;

public abstract class Animal {
    String name;
    int age;
    String color;
    void printName(){
        System.out.println(name);
    }

    abstract void eat();

    Animal(String name){
        this.name = name;
        this.age = 10;
        this.color = "Red";
    }
}
