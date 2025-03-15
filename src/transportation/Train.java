package transportation;

public class Train extends Vehicle {
    private static final int FIXED_FARE = 10000;

    public Train(String name, int capacity, String route) {
        super(name, capacity, route);
    }

    public void calculateFare() {
        int totalFare = FIXED_FARE * getCurrentPassengers();
        System.out.println("Tarif tetap per penumpang: Rp " + FIXED_FARE);
        System.out.println("Total tarif perjalanan kereta: Rp " + totalFare);
    }
}
