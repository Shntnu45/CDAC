class Passenger {
    private String name;
    private int age;
    private String seatType;
    private static int totalPassengers = 0;

    // Constructor 1
    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
        this.seatType = "General"; // default
        totalPassengers++;
    }

    // Constructor 2
    public Passenger(String name, int age, String seatType) {
        this.name = name;
        this.age = age;
        this.seatType = seatType;
        totalPassengers++;
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Seat: " + seatType);
    }

    public static void showTotalPassengers() {
        System.out.println("Total Passengers Booked: " + totalPassengers);
    }
}

public class Q6RailwayTicketBooking {
    public static void main(String[] args) {
        Passenger p1 = new Passenger("Ravi", 25);
        Passenger p2 = new Passenger("Anita", 30, "AC Sleeper");
        Passenger p3 = new Passenger("Suresh", 40);

        p1.printDetails();
        p2.printDetails();
        p3.printDetails();

        Passenger.showTotalPassengers();
    }
}
