package lab2.AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        Dog dylan = new Dog();
        System.out.println();
        System.out.println(dylan.breed);
        System.out.println("Age");
        System.out.println(dylan.age);
        System.out.println("Favourite activity is:");
        System.out.println(dylan.favourite_activity);
        System.out.println("and");
        dylan.eat();
        System.out.println("After that happily barks:");
        dylan.bark();
        System.out.println();

        Girl ela = new Girl();
        System.out.println("Ela, the adopter");
        System.out.println("Who is age");
        System.out.println(ela.age);
        System.out.println("Has this amount of money");
        System.out.println(ela.money);
        System.out.println("to buy food for");
        System.out.println(dylan.name);
        System.out.println("And take it to the Vet");
        System.out.println();

        VetDoctor mario = new VetDoctor();
        System.out.println(mario.specialist);
        mario.treats();
        mario.laughs();
        System.out.println("When Dylan");
        dylan.play();
        System.out.println();

        Recreation walking = new Recreation();
        System.out.println("Ela");
        ela.brushes();
        System.out.println("Dylan");
        System.out.println("and they start");
        System.out.println(walking.activity);


    }
}
