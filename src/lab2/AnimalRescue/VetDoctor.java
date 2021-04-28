package lab2.AnimalRescue;

public abstract class VetDoctor extends People {


    public void treats(){
        System.out.println("shots an injection");
    }

    @Override
    public void talk() {
        System.out.println("hello");
    }
}
