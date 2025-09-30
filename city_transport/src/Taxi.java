package model;

import java.util.ArrayList;
import java.util.List;

public class Taxi extends Transport {
    private boolean isAvailable;
    private List<Passenger> passengers = new ArrayList<>();

    public Taxi(int id, String routeNumber, int capacity, boolean isAvailable) {
        super(id, routeNumber, capacity);
        this.isAvailable = isAvailable;
    }

    @Override
    public void move() {
        System.out.println("Таксі " + getRouteNumber() + " Їде");
    }

    @Override
    public void displayInfo() {
        System.out.println("Таксі [ID=" + getId() +
                ", Route=" + getRouteNumber() +
                ", Capacity=" + getCapacity() +
                ", Available=" + isAvailable +
                ", Passengers=" + passengers.size() + "]");
    }

    @Override
    public void boardPassenger(Passenger p) {
        if (!isAvailable) {
            System.out.println("Таксі зайняте " + p.getName() + " не може сісти");
            return;
        }
        if (passengers.size() < getCapacity()) {
            passengers.add(p);
            isAvailable = false;
            System.out.println(p.getName() + " сів у таксі");
        }
    }

    @Override
    public void disembarkPassenger(Passenger p) {
        passengers.remove(p);
        isAvailable = true;
        System.out.println(p.getName() + " вийшов з таксі");
    }
}
