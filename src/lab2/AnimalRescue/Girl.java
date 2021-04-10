package lab2.AnimalRescue;

public class Girl {

    private String herName;
    private String eyes;
    private String gender;
    private int age;
    private Float money;

    public String getHerName() {
        return herName;
    }

    public void setHerName(String herName) {
        this.herName = herName;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public void pets(){
        System.out.println("petting the dog");
    }
    public void brushes(){
        System.out.println("brushes");
    }
    public void feeds(){
        System.out.println("feeds the dog");
    }
}
