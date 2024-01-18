package Task_2;

public class Person {
//    properties
    private String name;
    private int age;

//    Constructor
    public Person() {
        this.age = 18;
    }
//     Parameterised Constructor
    public Person(String name,int age) {
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
//    Method to display name and age of person
    public void disInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // object with default age
        Person person1 = new Person();
        person1.setName("naga");
        person1.disInfo();

        Person person2 = new Person("nagaraja", 25);
        person2.disInfo();
    }
}
