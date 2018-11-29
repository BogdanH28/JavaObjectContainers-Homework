package siit;

import java.util.ArrayList;
import java.util.List;

public class Hobby {

    private String nameOfHobby;
    private int frequency;
    private List<Address> availableAddresses = new ArrayList<>();

    public Hobby(String nameOfHobby, int frequency) {
        this.nameOfHobby = nameOfHobby;
        this.frequency = frequency;
    }

    public void addAddress(String country, String city) {
        Address address = new Address(country, city);
        availableAddresses.add(address);
    }

    @Override
    public String toString() {
        return "Hobby{ " +
                nameOfHobby + '\'' +
                ", frequency= " + frequency +
                ", availableAddresses= " + availableAddresses +
                " }";
    }
}
