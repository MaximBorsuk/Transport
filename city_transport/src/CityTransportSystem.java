package system;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class CityTransportSystem {
    private List<Transport> transports = new ArrayList<>();
    private List<Driver> drivers = new ArrayList<>();
    private List<Passenger> passengers = new ArrayList<>();

    public void addTransport(Transport t) { transports.add(t); }
    public void addDriver(Driver d) { drivers.add(d); }
    public void addPassenger(Passenger p) { passengers.add(p); }

    public void displayAllInfo() {
        System.out.println("\n--- TRANSPORTS ---");
        for (Transport t : transports) t.displayInfo();

        System.out.println("\n--- DRIVERS ---");
        for (Driver d : drivers) d.displayInfo();

        System.out.println("\n--- PASSENGERS ---");
        for (Passenger p : passengers) p.displayInfo();
    }
}
