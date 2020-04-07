package javareview;
// We need people to work at BranceTech
// I already have a Person class in this project so we're going to make a Human class
// Humans should have a name property with a getter, a setter and a constructor
public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
