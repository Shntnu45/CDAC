class Vehicle {
    private String regNo;
    private String ownerName;
    private String vehicleType;
    private static int vehicleCount = 1;

    public Vehicle(String ownerName, String vehicleType) {
        this.regNo = "MH-2025-" + vehicleCount++;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void printDetails() {
        System.out.println("RegNo=" + regNo + ", Owner=" + ownerName + ", Type=" + vehicleType);
    }
}

public class Q18VehicleRegistration {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rahul", "Car");
        Vehicle v2 = new Vehicle("Pooja", "Bike");

        v1.printDetails();
        v2.printDetails();
    }
}
