public class Book {

    // class variables
    private String author; 
    private String title;
    private int pageCount;

    // constructor
    public Book(String bookAuthor, String bookName, int pages) {
        this.title = bookName;
        this.author = bookAuthor;
        this.pageCount = pages;    
    }


    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.title;
    }
    public int getPages() {
        return this.pageCount;
    }
    public String toString()  {
        return this.author + ", " + this.title + ", " + this.pageCount  + " pages"  ;
    }
}

