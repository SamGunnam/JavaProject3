package libraryjavafx;

/**
 *
 * @author Sampath Gunnam
 */
public class Book {
    
    String title;
    boolean borrowed;

    // Creates a new Book
    public Book(String bookTitle) {
        // Implement this method
        title = bookTitle; 
    }

    // Marks the book as rented
    public void borrowed() {
        // Implement this method
        borrowed = true;
    }

    // Marks the book as not rented
    public void returned() {
        // Implement this method
        borrowed = false;
    }

    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        // Implement this method
        return borrowed == true;
    }

    // Returns the title of the book
    public String getTitle() {
        return title;
    }

    public static void main1(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("Java How To Program (Early Objects))");
        System.out.println("Title (should be Java How To Program (Early Objects))): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.borrowed();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
    
}
