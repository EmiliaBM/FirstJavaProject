package lab2.AnimalRescue;

public abstract class Cat extends Animal{

    public void eat(){

        System.out.println("yummy");
    }

    @Override
    public void sleep() {
        System.out.println("snhhh");
    }

    @Override
    public void speak() {
        System.out.println("Miau Miau");
    }

    public void purr(){
        System.out.println("purring");
    }
}
