package lab2.AnimalRescue;

public class Animal {

    private String name;
    private int age;
    private int health;
    private int hungry_level;
    private int happiness;
    private int HeightInCm;
    private String colour;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHungry_level() {
        return hungry_level;
    }

    public void setHungry_level(int hungry_level) {
        this.hungry_level = hungry_level;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getHeightInCm() {
        return HeightInCm;
    }

    public void setHeightInCm(int heightInCm) {
        HeightInCm = heightInCm;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void speak(){
        System.out.println("Speaking");
    }
    public void eat(){

        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("snoor");
    }
    public void poop(){
        System.out.println("pooping");
    }
}
