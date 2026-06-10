public class Archive {
    private String identifier;
    private String name;


    // constructor
    public Archive(String identifierName, String name) {
        this.identifier = identifierName;
        this.name = name;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Archive)) {
            return false;
        }


        // typeCast to check values
        Archive comparedItem = (Archive) compared;

        if (this.identifier.equals(comparedItem.identifier))  {
            return true;
        }
        return false;


    }

    public String toString() {
        return  this.identifier + ": " + this.name;
    }
}

