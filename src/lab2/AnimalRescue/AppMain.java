package lab2.AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        Dog dylan = new Dog();
        dylan.setName("Dylan");
        dylan.setAge(3);
        dylan.setHealth(8);
        dylan.setHungry_level(7);

       System.out.println("Pe cainele meu il cheama " + dylan.getName() +
               " si are varsta de " + dylan.getAge() + " ani");

       Girl ela = new Girl() {
           @Override
           public void talk() {
               System.out.println("hi");
           }
       };
       ela.setName("Ella");
       ela.setEyes("blue");

       DogFood belo = new DogFood();
       belo.setNameIt("belo");
       belo.setSupplyNumberOfBags(3);
       belo.setPrice(12);
       belo.setQuantityInKg(10);

       Recreation walking = new Recreation();
       walking.setActivity("walking");

       VetDoctor mario = new VetDoctor() {
           @Override
           public void talk() {
               super.talk();
           }
       };
       mario.setName("Mario");

       dylan.speak();

       Horse Runny = new Horse() {
           @Override
           public void eat() {
               System.out.println("yum");
           }

           @Override
           public void sleep() {
               System.out.println("pfuuu");
           }
       };
       Runny.speak();

       ArabianHorse Thunder = new ArabianHorse();
       Thunder.race();

       Cat Tom = new Cat() {
           @Override
           public void speak() {
               System.out.println("Miauu");
           }
       };
       Tom.eat();

       Duck Donald = new Duck() {
           @Override
           public void speak() {
               System.out.println("MAcMac");
           }
       };
       Donald.eat();
    }
}





