package model;

public class Driver extends Person {

    public Driver(String name, int id) {
        super(name, id);
    }

    public void drive(Transport t) {
        System.out.println(getName() + " is driving transport ID " + t.getId());
        t.move();
    }

    @Override
    public void displayInfo() {
        System.out.println("Водій [Name=" + getName() + ", ID=" + getId() + "]");
    }
}
