class Mobile {
    String model;
    static int totalMobile = 0;

    // Constructor
    Mobile(String model) {
        this.model = model;
        totalMobile++;
    }

    // Getter for model
    String getModel() {
        return model;
    }

    // Getter for total mobiles
    static int getTotalMobile() {
        return totalMobile;
    }
}

public class Q2MobileTracker {
    public static void main(String[] args) {
        Mobile model1 = new Mobile("Samsung Galaxy M32");
        Mobile model2 = new Mobile("Redmi Note 12");

        System.out.println("Mobile1: Model = " + model1.getModel());
        System.out.println("Mobile2: Model = " + model2.getModel());
        System.out.println("Total Mobiles in stock: " + Mobile.getTotalMobile());
    }
}
