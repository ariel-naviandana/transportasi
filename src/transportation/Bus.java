package transportation;

public class Bus extends Vehicle {
    private static final int FARE_PER_STOP = 2000;
    private static final int capacity = 50;

    public Bus(String name, String route) {
        super(name, capacity, route);
    }

    public void calculateFare(int stops) {
        int totalFare = stops * FARE_PER_STOP * getCurrentPassengers();
        System.out.println("Total penumpang: " + getCurrentPassengers());
        System.out.println("Total pemberhentian: " + stops);
        System.out.println("Tarif per halte: Rp " + FARE_PER_STOP);
        System.out.println("Total tarif perjalanan bus: Rp " + totalFare);
    }
}
