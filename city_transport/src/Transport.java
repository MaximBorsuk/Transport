package model;

public abstract class Transport implements PassengerCarrier {
    private int id;
    private String routeNumber;
    private int capacity;

    public Transport(int id, String routeNumber, int capacity) {
        this.id = id;
        this.routeNumber = routeNumber;
        this.capacity = capacity;
    }

    public int getId() { return id; }
    public String getRouteNumber() { return routeNumber; }
    public int getCapacity() { return capacity; }

    public abstract void move();
    public abstract void displayInfo();
}
