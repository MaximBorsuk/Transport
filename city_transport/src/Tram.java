package model;

import java.util.ArrayList;
import java.util.List;

public class Tram extends Transport {
    private double trackLength;
    private List<Passenger> passengers = new ArrayList<>();

    public Tram(int id, String routeNumber, int capacity, double trackLength) {
        super(id, routeNumber, capacity);
        this.trackLength = trackLength;
    }

    @Override
    public void move() {
        System.out.println("Трамвай " + getRouteNumber() + "їде по коліям");
    }

    @Override
    public void displayInfo() {
        System.out.println("Трамвай [ID=" + getId() +
                ", Route=" + getRouteNumber() +
                ", Capacity=" + getCapacity() +
                ", TrackLength=" + trackLength +
                ", Passengers=" + passengers.size() + "]");
    }

    @Override
    public void boardPassenger(Passenger p) {
        if (passengers.size() < getCapacity()) {
            passengers.add(p);
            System.out.println(p.getName() + " сів у трамвай");
        } else {
            System.out.println("Трамвай поний! " + p.getName() + " не може сісти");
        }
    }

    @Override
    public void disembarkPassenger(Passenger p) {
        passengers.remove(p);
        System.out.println(p.getName() + " покинув трамвай.");
    }
}
