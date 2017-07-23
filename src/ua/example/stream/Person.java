package ua.example.stream;

/**
 * Created by maxura on 24.07.2017.
 */
public class Person {
    String name;
    int age;
    public String getName() {
        return name;
    }

    public  Person(String name, int age){
        super();
        this.name = name;
        this.age =age;
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

    @Override
    public String toString() {
        return String.format("%s - %d", this.getName(), this.getAge());
    }
}
