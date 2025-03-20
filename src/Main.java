import transportation.*;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("Bus TransJakarta", 50, "Terminal A - Terminal B");
        bus.startJourney();
        bus.boardPassengers(30);
        bus.boardPassengers(20);
        bus.calculateFare(5);
        bus.stopJourney();
        bus.dropPassengers(50);

        System.out.println("\n----------------------------------\n");

        Train train = new Train("Kereta Commuter Line", 200, "Stasiun Kota - Stasiun Pusat");
        train.startJourney();
        train.boardPassengers(150);
        train.calculateFare();
        train.stopJourney();
        train.dropPassengers(150);

        System.out.println("\n----------------------------------\n");

        Taxi taxi = new Taxi("Taksi BlueBird", 4, "Bandara - Hotel");
        taxi.startJourney();
        taxi.boardPassengers(3);
        taxi.calculateFare(10);
        taxi.stopJourney();
        taxi.dropPassengers(3);
    }
}