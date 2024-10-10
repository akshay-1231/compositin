package composition;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Book {
	public String title;
	public String auther;

	public Book(String title, String auther) {
		super();
		this.title = title;
		this.auther = auther;
	}

}

class Library {
	private final List<Book> books;

	//            datatype variable
	Library(List<Book> books) {
		this.books = books;
	}

	public List<Book> getTotalBooksInLibrary() {
		return books;
	}
}

public class CompositionDemo {

	public static void main(String[] args) {
		// creating book object
		Book b1 = new Book("java program", "dddssd");
		Book b2 = new Book("thinking ", "fdfdgrg");
		Book b3 = new Book(" java ", "fdfdgrg");
		// aading object into collection
		List<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		// craeting library object with books collection
		Library library = new Library(books);

		List<Book> books1 = library.getTotalBooksInLibrary();
		for (Book book : books1) {
			System.out.println("tiltle :" + book.title + " and" + "   Auther :" + book.auther);

		}
	}

}
