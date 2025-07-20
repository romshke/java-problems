import java.util.Scanner;

public class Main {

    // defining class Book
    public static class Book {
        String title;
        String author;
        double price;

        // Your constructors go here
        // Constructor with 2 parameters: title & author
        // Constructor with 3 parameters: title, author & price
        public Book(String title, String author) {
            this.title = title;
            this.author = author;
            this.price = 0.0;
        }

        public Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        // this method should return the details of the book in this format: title - author - price
        public String getDetails () {
            return String.format("%s - %s - %.1f", this.title, this.author, this.price);
        }
    }

    public static void main(String[] args) {
        // use Scanner Class for User Input
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        Book book = null;

        // logic to check whether the line has title, author and price or just title and author
        String[] parts = line.split(",");
        if (parts.length == 3) {
            String title = parts[0];
            String author = parts[1];
            double price = Double.parseDouble(parts[2]);
            // Use the constructor with 3 parameters to create a new object of type Book
            book = new Book(title, author, price);
        } else {
            String title = parts[0];
            String author = parts[1];
            // Use the constructor with 2 parameters to create a new object of type Book
             book = new Book(title, author);
        } 

        // print the details of the book using the getDetails() method
        System.out.println(book.getDetails());
    }
}