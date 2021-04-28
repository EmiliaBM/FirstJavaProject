package lab2.AnimalRescue;

public abstract class Duck extends Animal{

    public void fly(){

        System.out.println("flying");
    }
    @Override
    public void speak() {
        System.out.println("MAcMac");
    }

    @Override
    public void sleep() {
        System.out.println("yuck");
    }
    public void eat() {

        System.out.println("yupii iei");
    }
}
