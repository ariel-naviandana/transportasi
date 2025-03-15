package transportation;

public class Taxi extends Vehicle {
    private static final int FARE_PER_KM = 5000;

    public Taxi(String name, int capacity) {
        super(name, capacity, "Rute fleksibel");
    }

    public void calculateFare(int distance) {
        int totalFare = distance * FARE_PER_KM;
        System.out.println("Tarif per km: Rp " + FARE_PER_KM);
        System.out.println("Total tarif perjalanan taksi: Rp " + totalFare);
    }
}
