package net.javacode;
import java.util.Scanner;

public class Book {
		String title;
		String author;
		int numberOfPages;
	

	}


public class BookInputTest {
	
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the title of the book");
        String title = scanner.nextLine();

        System.out.println("Please enter the author name");
        String author = scanner.nextLine();

        System.out.println("Please enter the number of pages");
        int numberOfPages = scanner.nextInt();

        // Create a new Book object and set its attributes
        Book book = new Book();
        book.title = title;
        book.author = author;
        book.numberOfPages = numberOfPages;
        
        // Output the information
        System.out.println("The book title is: " + book.title);
        System.out.println("The book author is: " + book.author);
        System.out.println("The book has " + book.numberOfPages + " pages");

        // Close the scanner
        scanner.close();
	}
}