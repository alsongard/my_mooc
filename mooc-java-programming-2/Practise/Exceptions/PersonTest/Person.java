public class Person {

    private String name;
    private int age;


    // constructor
    public Person(String name, int age) {
        if (name == null) {
            throw new NullPointerException("name cannot be null");
        }
        else if (name.isEmpty() ||name.length() > 40) {
            throw new IllegalArgumentException("name should not be empty or null or length should not be greater than 40 characters");
        } else if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age should be between 0 and 120");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
