package Exercises_06_Objects_and_Classes;

public class Human {
    private String name;
    private String id;
    private int age;

    public Human(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.", getName(), getId(), getAge());
    }
}
