package main;

import model.*;
import system.CityTransportSystem;

public class Main {
    public static void main(String[] args) {
        CityTransportSystem system = new CityTransportSystem();

        Bus bus = new Bus(1, "69", 3, true);
        Tram tram = new Tram(2, "5", 4, 12.5);
        Taxi taxi = new Taxi(3, "T1", 1, true);

        system.addTransport(bus);
        system.addTransport(tram);
        system.addTransport(taxi);

        Driver d1 = new Driver("Іван", 101);
        Driver d2 = new Driver("Еліс", 102);
        Driver d3 = new Driver("Поля", 103);

        system.addDriver(d1);
        system.addDriver(d2);
        system.addDriver(d3);

        Passenger p1 = new Passenger("Анрій", 201, 1001);
        Passenger p2 = new Passenger("Оля", 202, 1002);
        Passenger p3 = new Passenger("Софія", 203, 1003);
        Passenger p4 = new Passenger("Тарас", 204, 1004);
        Passenger p5 = new Passenger("Іра", 205, 1005);

        system.addPassenger(p1);
        system.addPassenger(p2);
        system.addPassenger(p3);
        system.addPassenger(p4);
        system.addPassenger(p5);

        bus.boardPassenger(p1);
        bus.boardPassenger(p2);
        bus.boardPassenger(p3);
        bus.boardPassenger(p4);

        tram.boardPassenger(p5);

        taxi.boardPassenger(p4);
        taxi.boardPassenger(p2);

        d1.drive(bus);
        d2.drive(tram);
        d3.drive(taxi);


        system.displayAllInfo();
    }
}
