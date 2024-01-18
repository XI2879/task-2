package Task_2;

public class Persons {
    //    properties
    private String name;
    private int age;

    //    Constructor
    public Persons() {
    }
    //     Parameterised Constructor
    public Persons(String name,int age) {
        this.name = name;
        this.age = age;
    }

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
}

// subclass

