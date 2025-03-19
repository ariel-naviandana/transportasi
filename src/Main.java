import transportation.*;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("Bus TransJakarta", "Rute A");
        bus.startJourney();
        bus.boardPassengers(30);
        bus.calculateFare(5);
        bus.dropPassengers(10);
        bus.stopJourney();

        System.out.println("\n----------------------------------\n");

        Train train = new Train("Kereta Commuter Line", "Rute B");
        train.startJourney();
        train.boardPassengers(150);
        train.calculateFare();
        train.stopJourney();

        System.out.println("\n----------------------------------\n");

        Taxi taxi = new Taxi("Taksi BlueBird");
        taxi.boardPassengers(3);
        taxi.calculateFare(10);
        taxi.dropPassengers(3);
        taxi.stopJourney();
    }
}