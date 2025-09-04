class Customer {
    private String name;
    private String ticketType;
    private static int totalTickets = 0;

    // Constructor 1
    public Customer(String name) {
        this.name = name;
        this.ticketType = "Normal";
        totalTickets++;
    }

    // Constructor 2
    public Customer(String name, String ticketType) {
        this.name = name;
        this.ticketType = ticketType;
        totalTickets++;
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", Ticket: " + ticketType);
    }

    public static void showTotalTickets() {
        System.out.println("Total Tickets Sold: " + totalTickets);
    }
}

public class Q7MovieTicketBooking {
    public static void main(String[] args) {
        Customer c1 = new Customer("Rahul");
        Customer c2 = new Customer("Pooja", "Premium");
        Customer c3 = new Customer("Amit");

        c1.printDetails();
        c2.printDetails();
        c3.printDetails();

        Customer.showTotalTickets();
    }
}
