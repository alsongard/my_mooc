public class Agent {

    private String firstName;
    private String lastName;
    
    public Agent(String initFirstName, String initLastName) {
        this.firstName = initFirstName;
        this.lastName = initLastName;
    }
    // My name is Bond, James Bond
    public String toString(){
        return "My name is " + this.lastName + ", " + this.firstName + " " + this.lastName;
    }
    
}

