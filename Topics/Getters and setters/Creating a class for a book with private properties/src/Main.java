import java.util.Scanner;

// Creating class
class Book {
    // set up three private properties
    private String title;
    private String author;
    private int numberOfPages;

    // getters and setters go here
    // Remember: 
    // 1. They must not allow empty string for 'title' and 'author'.
    // 2. They must not allow negative or zero value for 'numberOfPages'.
    // 3. If such values are attempted to be set, the property should remain unchanged.


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setTitle(String title) {
        if (!title.isEmpty()) {
            this.title = title;
        }
    }

    public void setAuthor(String author) {
        if (!title.isEmpty()) {
            this.author = author;
        }
    }

    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages > 0) {
            this.numberOfPages = numberOfPages;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an object of the Book class
        Book book = new Book();

        // Take Title, Author and numberOfPages as next inputs and set them using the mutator methods
        // Your code here
        book.setTitle(scanner.nextLine());
        book.setAuthor(scanner.nextLine());
        book.setNumberOfPages(scanner.nextInt());

        // Then use the accessor methods to get and print these values.
        // Your code here
        System.out.printf("%s%n%s%n%s", book.getTitle(), book.getAuthor(), book.getNumberOfPages());

        scanner.close();
    }
}