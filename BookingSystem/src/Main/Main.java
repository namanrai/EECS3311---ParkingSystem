package Main;

import Database.Database;
import DesignPatterns.*;
import Models.Manager;
import Models.ParkingLot;
import Models.ParkingSpace;
import Models.User;

public class Main {
	public static void main(String[] args) {
        System.out.println("Hello, World!");
        User ahmad = UserFactory.createUser("Student","ahmad","ahmadzaki@gmail.com","123","ON8828");
        System.out.println(ahmad.getUsername());
        Manager manager = new Manager();
        ParkingLot Lot1 = new ParkingLot("1");
        ParkingSpace space = Lot1.getSpaces().get(1);
        manager.disableParkingspace(space);
        Database database = Database.getInstance();
        database.addAccount(ahmad);
        System.out.println(database.getUsers().get(0).getUsername());
        User naman = UserFactory.createUser("Student","naman","naman@gmail.com","123aB!456","ON8888");
        naman.registerAccount(naman.getUsername(),naman.getPassword());
        System.out.println(database.getUsers().get(1).getUsername());
    }
}
