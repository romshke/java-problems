import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        Book book = new Book();

        // Set the details of the book
        // Implement here
        book.setTitle(title);
        book.setAuthor(author);
        book.setPages(100);

        // Print the details of the book
        // Implement here
        System.out.printf("Title: %s, Author: %s, Pages: %d", book.getTitle(), book.getAuthor(), book.getPages());

        sc.close();
    }
}

class Book {
    private String title;
    private String author;
    private int pages;

    // Getters and setters
    // Implement here

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}