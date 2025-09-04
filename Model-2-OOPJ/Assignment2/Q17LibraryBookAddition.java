class Book {
    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public void printDetails() {
        System.out.println("BookId=" + bookId + ", Title=" + title + ", Author=" + author);
    }
}

class Library {
    private String libraryName;
    private static int totalBooks = 0;

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public void addBook(Book b) {
        totalBooks++;
        System.out.print(libraryName + " added -> ");
        b.printDetails();
    }

    public static void displayTotalBooks() {
        System.out.println("Total Books in Library: " + totalBooks);
    }
}

public class Q17LibraryBookAddition {
    public static void main(String[] args) {
        Library lib = new Library("CDAC Library");

        Book b1 = new Book(101, "Java Basics", "James Gosling");
        Book b2 = new Book(102, "OOP Concepts", "Bjarne Stroustrup");

        lib.addBook(b1);
        lib.addBook(b2);

        Library.displayTotalBooks();
    }
}
