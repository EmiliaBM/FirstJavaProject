package lab2.AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        Dog dylan = new Dog();
        System.out.println(dylan.breed);
        System.out.println("Age");
        System.out.println(dylan.age);
        System.out.println("Favourite activity is:");
        System.out.println(dylan.favourite_activity);
        System.out.println("and");
        dylan.eat();
        System.out.println("After that happily barks:");
        dylan.bark();

        Girl anna = new Girl();
    }
}
