package AbstractClasses;

public class Main {
    public static void main(String[] args){
        Animal a = new Dog();

        System.out.println(Dog.y);

        Dog d = new Dog();

        System.out.println(Dog.y);

        BullDog bd = new BullDog();
        BullDog.doSomething();

        Dog d1 = new Dog();
        Dog.doSomething();

        //Final


    }
}
