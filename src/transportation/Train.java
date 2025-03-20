package transportation;

public class Train extends Vehicle {
    private static final int FIXED_FARE = 10000;
    private static final int capacity = 200;
    private static final String route = "Stasiun Kota - Stasiun Pusat";

    public Train(String name) {
        super(name, capacity, route);
    }

    public void calculateFare() {
        int totalFare = FIXED_FARE * getCurrentPassengers();
        System.out.println("Total penumpang: " + getCurrentPassengers());
        System.out.println("Tarif tetap per penumpang: Rp " + FIXED_FARE);
        System.out.println("Total tarif perjalanan kereta: Rp " + totalFare);
    }
}
