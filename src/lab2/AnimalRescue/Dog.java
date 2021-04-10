package lab2.AnimalRescue;

public class Dog {

    private String name;
    private String breed;
    private int age;
    private int health;
    private int hungry_level;
    private int happiness;
    private String name_of_food;
    private String favourite_activity;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getBreed() {
        return breed;
    }

    public void setBreed (String breed){

        this.breed=breed;
    }

    public int getAge(){

        return age;
    }

    public void setAge(int age){

        this.age=age;
    }
    public int getHealth(){

        return health;
    }

    public void setHealth(int health){

        this.health=health;
    }

    public int getHungry_level(){

        return hungry_level;
    }

    public void setHungry_level(int hungry_level){

        this.hungry_level=hungry_level;
    }

    public int getHappiness(){

        return happiness;
    }

    public void setHapiness(int happiness){

        this.happiness=happiness;
    }

    public String getName_of_food(){
        return name_of_food;
    }

    public void setName_of_food(String name_of_food){

        this.name_of_food=name_of_food;
    }

    public String getFavourite_activity(){

        return favourite_activity;
    }

    public void setFavourite_activity(String favourite_activity){

        this.favourite_activity=favourite_activity;
    }

    public void eat(){

        System.out.println("eating dog food Belo");
    }
    public void bark(){
        System.out.println("Hamham");
    }

    public void play(){

        System.out.println("jumps");
    }
}
