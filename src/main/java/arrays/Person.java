package arrays;

import java.util.Objects;

public class Person {
    private double height;
    private double weight;
    private String ssn;
    private String phoneNumber;

    // Constructor
    public Person(double height, double weight, String ssn, String phoneNumber) {
        this.height = height;
        this.weight = weight;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
    }

    // Getters for the variables

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getSsn() {
        return ssn;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Override equals method to match based on SSN
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return Objects.equals(ssn, person.ssn);
    }

    // Override hashCode method for consistency with equals
    @Override
    public int hashCode() {
        return Objects.hash(ssn);
    }

    // Example usage in main method
    public static void main(String[] args) {
        Person person1 = new Person(175.0, 70.0, "123-45-6789", "555-1234");
        Person person2 = new Person(180.0, 75.0, "987-65-4321", "555-5678");
        Person person3 = new Person(165.0, 65.0, "123-45-6789", "555-4321");

        // Test equality based on SSN
        System.out.println("person1 equals person2: " + person1.equals(person2)); // false
        System.out.println("person1 equals person3: " + person1.equals(person3)); // true
    }
}
