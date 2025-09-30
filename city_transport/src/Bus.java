package model;

import java.util.ArrayList;
import java.util.List;

public class Bus extends Transport {
    private boolean isDoubleDecker;
    private List<Passenger> passengers = new ArrayList<>();

    public Bus(int id, String routeNumber, int capacity, boolean isDoubleDecker) {
        super(id, routeNumber, capacity);
        this.isDoubleDecker = isDoubleDecker;
    }

    @Override
    public void move() {
        System.out.println("Автобус " + getRouteNumber() + " рухається");
    }

    @Override
    public void displayInfo() {
        System.out.println("Автобус [ID=" + getId() +
                ", Route=" + getRouteNumber() +
                ", Capacity=" + getCapacity() +
                ", DoubleDecker=" + isDoubleDecker +
                ", Passengers=" + passengers.size() + "]");
    }

    @Override
    public void boardPassenger(Passenger p) {
        if (passengers.size() < getCapacity()) {
            passengers.add(p);
            System.out.println(p.getName() + " сів в автобус");
        } else {
            System.out.println("Автобус повний! " + p.getName() + " не може сісти.");
        }
    }

    @Override
    public void disembarkPassenger(Passenger p) {
        passengers.remove(p);
        System.out.println(p.getName() + "вийшов з автобуса");
    }
}
