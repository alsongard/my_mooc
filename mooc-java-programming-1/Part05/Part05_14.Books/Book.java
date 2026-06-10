
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    // set an equals method
    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Book)) {
            return false;
        }

        // typecast to access values
        Book comparedItem = (Book) compared;

        if (this.name.equals(comparedItem.name) && this.publicationYear == comparedItem.publicationYear) {
            return true;
        }
        return false;
    }
}

