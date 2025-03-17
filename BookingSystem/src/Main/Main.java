package Main;

import DesignPatterns.*;
import Models.Manager;
import Models.ParkingLot;
import Models.ParkingSpace;
import Models.User;

public class Main {
	public static void main(String[] args) {
        System.out.println("Hello, World!");
        User ahmad = UserFactory.createUser("Student","ahmad","ahmadzkai","123");
        System.out.println(ahmad.getUsername());
        Manager manager = new Manager();
        ParkingLot Lot1 = new ParkingLot("1");
        ParkingSpace space = Lot1.getSpaces().get(1);
        manager.disableParkingspace(space);
    }
}
