
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true; // checks if the reference value assigned to compared Object variable is the same as the address for this Object
        }

        if (!(compared instanceof Person)) {
            return false;
        }

        Person comparedItem = (Person) compared;


        if (this.name.equals(comparedItem.name) &&
            this.height == comparedItem.height  && 
            this.weight == comparedItem.weight  &&
            this.birthday.getDay() == comparedItem.birthday.getDay() &&
            this.birthday.getMonth() == comparedItem.birthday.getMonth() &&
            this.birthday.getYear() == comparedItem.birthday.getYear()
        ) {
                return true;
            }
        return false;
    }
}

