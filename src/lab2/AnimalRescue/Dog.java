package lab2.AnimalRescue;

public class Dog extends Animal{

    @Override
    public void speak(){

        System.out.println("HamHam");
    }

    public void play(){

        System.out.println("jumps");
    }

    @Override
    public void eat() {
        System.out.println("yummy");
    }

    @Override
    public void sleep() {
        System.out.println("snooor");
    }
}
