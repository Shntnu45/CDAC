class Book {
    private String title;
    private String author;
    private boolean issued;

    private static int totalIssuedBooks = 0;

    // Constructor
    public Book(String title, String author, boolean issued) {
        this.title = title;
        this.author = author;
        this.issued = issued;

        // count issued book at creation
        if (issued) {
            totalIssuedBooks++;
        }
    }

    // Getters
    public String gettitle() {
        return title;
    }

    public String getauthor() {
        return author;
    }

    public boolean isIssued() {   // better naming
        return issued;
    }

    // Setters
    public void settitle(String title) {
        this.title = title;
    }

    public void setauthor(String author) {
        this.author = author;
    }

    public void setissued(boolean issued) {
        if (!this.issued && issued) {
            totalIssuedBooks++;
        } else if (this.issued && !issued) {
            totalIssuedBooks--;
        }
        this.issued = issued;
    }

    // Static method to show total issued books
    public static void showTotalIssued() {
        System.out.println("Total books issued: " + totalIssuedBooks);
    }
}

class Q3BookTracker {
    public static void main(String[] args) {
        // Creating books
        Book book1 = new Book("Harry Potter", "J.K. Rowling", true);
        Book book2 = new Book("Five Point Someone", "Chetan Bhagat", false);
        Book book3 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", true);

        // Printing details
        System.out.println("Book1 issued? " + book1.isIssued());
        System.out.println("Book2 issued? " + book2.isIssued());
        System.out.println("Book3 issued? " + book3.isIssued());

        // Show total issued books
        Book.showTotalIssued();
    }
}


/* Output is 
Book1 issued? true
Book2 issued? false
Book3 issued? true
Total books issued: 2 *\
