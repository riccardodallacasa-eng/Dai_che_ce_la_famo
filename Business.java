import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Business {
    private String name;
    private String address;
    private String phoneNumber;
    private final List<Person> people = new ArrayList<>();

    public Business(String name) {
        this(name, "", "");
    }

    public Business(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addPerson(Person p) {
        if (p != null) {
            people.add(p);
        }
    }

    public List<Person> getPeople() {
        return Collections.unmodifiableList(people);
    }

    public static class Person {
        private String firstName;
        private String lastName;
        private int age;

        public Person(String firstName, String lastName) {
            this(firstName, lastName, 0);
        }

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName + (age > 0 ? " (" + age + ")" : "");
        }
    }
}
