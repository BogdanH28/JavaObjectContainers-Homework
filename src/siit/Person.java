package siit;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private int age;
    private List<Hobby> hobbies = new ArrayList<>();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void addHobby(Hobby hobby) {
        hobbies.add(hobby);
    }

    @Override
    public String toString() {
        return  "\nPerson{" +
                "name= '" + name + '\'' +
                ", age= " + age +
                ", hobbies= " + hobbies +
                " }";
    }

}
