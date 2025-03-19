package Main;

import Database.Database;
import DesignPatterns.*;
import Models.Manager;
import Models.ParkingLot;
import Models.ParkingSpace;
import Models.User;
import Models.SuperManager;

public class Main {
	public static void main(String[] args) {
        System.out.println("Hello, World!");
        User ahmad = UserFactory.createUser("Student","ahmad","ahmadzaki@gmail.com","123","ON8828");
        System.out.println(ahmad.getUsername());
        Database database = Database.getInstance();
        database.addAccount(ahmad);
        System.out.println(database.getUsers().get(0).getUsername());
        User naman = UserFactory.createUser("Student","naman","naman@gmail.com","123aB!456","ON8888");
        naman.registerAccount(naman.getUsername(),naman.getPassword());
        System.out.println(database.getUsers().get(1).getUsername());

        //SuperManager, Manager and Proxy test

        //initialization
        SuperManager superManager = SuperManager.getInstance();
        // Create a manager with full access to the Proxy
        Manager manager = superManager.createManagerAccount(true);


            //as a manager
            manager.addParkingLot("Lot-A");
            manager.addParkingLot("Lot-B");
            manager.enableParkinglot("Lot-A");
            manager.disableParkinglot("Lot-B");
            manager.enableParkingspace("Lot-A", "Lot-A-1");
            manager.disableParkingspace("Lot-A", "Lot-A-1");
            manager.removeParkingLot("Lot-B");

            //as a non-manager
            ParkingProxy userProxy = new ParkingProxy(false); // Non-manager
            Manager user = new Manager(userProxy);
            user.addParkingLot("Lot-C"); // Unauthorized access
            user.enableParkinglot("Lot-A"); // Unauthorized access
            user.removeParkingLot("Lot-A"); // Unauthorized access
    }
}
