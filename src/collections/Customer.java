package collections;

public class Customer implements Comparable<Customer> {
     private String name;


    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Customer other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }
    public String getEmail() {
        return email;
    }
}
