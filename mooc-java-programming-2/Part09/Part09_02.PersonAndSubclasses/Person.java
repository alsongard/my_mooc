public class Person {
    private String name;
    private String address;


    public Person(String username, String userAddress) {
        this.name = username;
        this.address = userAddress;
    }

    public String toString() {
        return this.name + "\n  " + this.address;
    }
}

