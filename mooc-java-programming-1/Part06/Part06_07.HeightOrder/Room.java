import java.util.ArrayList;

public class Room {
    private ArrayList<Person> personList;

    public Room () {
        this.personList = new ArrayList<>();
    }

    public void add(Person givenPerson) {
        this.personList.add(givenPerson);
    }
    public boolean isEmpty() {
        if (this.personList.isEmpty()) {
            return true;
        } else { 
            return false;
        }
    }

    public ArrayList<Person> getPersons() {
        return this.personList;
    }

    public Person shortest() {

        if (this.personList.isEmpty()) {
            return null;
        }
        Person currentPerson = this.personList.get(0);

        for (Person personItem : this.personList) {

            if (personItem.getHeight() < currentPerson.getHeight() ){
                currentPerson = personItem;
            }
        }

        return currentPerson;
    }

    public Person take() {
        if (this.personList.isEmpty()) {
            return null;
        }
        Person shortestPerson  = this.shortest();

        this.personList.remove(shortestPerson);
        return shortestPerson;

    }

    /*
        Create Room class. The class should contain a list of persons as an instance variable, and it should have a parameterless constructor. In addition, add the following methods to the class:
        public void add(Person person) - add the person passed as a paramter to the list.
        public boolean isEmpty() - returns a boolean-type value true or false, that tells whether the room is empty or not.
        public ArrayList<Person> getPersons() - returns a list of the persons in the room.

        Add a public Person shortest() method to the Room class, which returns the shortest person added to the room. If the room is empty, a null reference is returned
        Add a public Person take() method to the Room class, which takes the shortest person in the room. When a room is empty, it returns a null reference.
    */
}

