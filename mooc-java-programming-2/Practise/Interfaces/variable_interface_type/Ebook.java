import java.util.ArrayList;

public class Ebook implements Readable {
    private String bookTitle; 
    private ArrayList<String> pages;

    public Ebook(String bookName) {
        this.bookTitle = bookName;
        this.pages = new ArrayList<>();
    }

    public String read(int pageNumber){
        // if (this.pages.size() == 0) {
        //     return "No pages at the moment!\nAdd using addPages method!";
        // } 
        
        // for (String pageItem: this.pages) {
        //     return pageItem;
        // }
        
        return this.pages.get(pageNumber);
    }
    public void addPages(ArrayList<String> pages) {
        for (String pageItem: pages) {
            this.pages.add(pageItem);
        }
    }
    public int bookPages() {
        return this.pages.size();
    }

}
