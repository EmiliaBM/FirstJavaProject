package lab2.AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        Dog dylan = new Dog();
        dylan.setName("Dylan");
        dylan.setBreed("maltese");
        dylan.setAge(3);
        dylan.setHealth(8);
        dylan.setHungry_level(7);
        dylan.setHapiness(9);
        dylan.setName_of_food("belo");
        dylan.setFavourite_activity("walking");
       System.out.println("Pe cainele meu il cheama " + dylan.getName() +
               " si este " + dylan.getBreed() + " si are varsta de " + dylan.getAge() + " ani");

       Girl ela = new Girl();
       ela.setHerName("Ella");
       ela.setEyes("blue");
       ela.setMoney(100f);

       DogFood belo = new DogFood();
       belo.setNameIt("belo");
       belo.setSupplyNumberOfBags(3);
       belo.setPrice(12);
       belo.setQuantityInKg(10);

       Recreation walking = new Recreation();
       walking.setActivity("walking");

       VetDoctor mario = new VetDoctor();
       mario.setSpecialist("Head of the clinic");
       mario.setName("Mario");
    }
}





