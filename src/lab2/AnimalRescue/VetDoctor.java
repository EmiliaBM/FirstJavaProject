package lab2.AnimalRescue;

public class VetDoctor {

    String name = "Mario";
    String specialist = "Head of the Vet Clinic";

    public void treats(){
        System.out.println("shots an injection");
    }

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialist(String specialist) {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public void laughs(){
        System.out.println("laughs at the dog");
    }
}
