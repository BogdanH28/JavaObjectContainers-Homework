package siit;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        First Requirement
        NameComparator nameComparator = new NameComparator();
        Set<Person> peopleByName = new TreeSet<>(nameComparator);

        AgeComparator ageComparator = new AgeComparator();
        Set<Person> peopleByAge = new TreeSet<>(ageComparator);

        Person person1 = new Student("A", 22);
        Person person2 = new Employed("B", 31);
        Person person3 = new Unemployed("C", 25);

        peopleByAge.add(person1);
        peopleByAge.add(person2);
        peopleByAge.add(person3);

        System.out.println("===AgeComparator===");
        for (Person person: peopleByAge) {
            System.out.println(person);
        }

        peopleByName.add(person1);
        peopleByName.add(person2);
        peopleByName.add(person3);

        System.out.println("===NameComparator===");
        for (Person person: peopleByName) {
            System.out.println(person);
        }
        System.out.println("======================================");

//        Second Requirement
        List<Hobby> hobbies = new ArrayList<>();

        Hobby football = new Hobby("Football", 3);
        Hobby tennis = new Hobby("Tennis", 5);
        Hobby running = new Hobby("Running", 6);

        football.addAddress("Romania", "Cluj-Napoca");
        football.addAddress("Iraly", "Rome");
        tennis.addAddress("Romania", "Sibiu");
        tennis.addAddress("Canada", "Toronto");
        running.addAddress("France", "Paris");
        running.addAddress("England", "London");

        person1.addHobby(football);
        person1.addHobby(tennis);
        person2.addHobby(football);
        person3.addHobby(running);

        Map<Person, List<Hobby>> peopleHobbies = new HashMap<>();

        peopleHobbies.put(person1, hobbies);
        peopleHobbies.put(person2, hobbies);
        peopleHobbies.put(person3, hobbies);

        System.out.println(peopleHobbies);
    }
}
