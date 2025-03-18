package Models;

import Database.Database;
import HelperFunctions.*;

public class Faculty implements  User {
    private String email;
    private String password;
    private String licensePlate;
    private ParkingSpace parkingSpace;
    private String username;

    public Faculty(String name, String email, String password, String licensePlate) {
        this.username = name;
        this.email = email;
        this.password = password;
        this.licensePlate = licensePlate;
    }

    public double getParkingRate() {
        return 8.0; // $8 per hour
    }

    @Override
    public String getEmail() { return email; }

    @Override
    public String getPassword() { return password; }

    @Override
    public String getLicensePlate() { return licensePlate; }

    @Override
    public ParkingSpace getParkingSpace() { return parkingSpace; }

    @Override
    public String getUsername() { return username; }

//    @Override
//    public Card paymentInformation(String input) {
//        return new Card(input); // Example logic
//    }

    @Override
    public boolean registerAccount(String username, String password) {
        Database database = Database.getInstance();
        boolean exists = false;
        for(User user: database.getUsers()) {
            if (user.getUsername().equals(username)) {
                exists = true;
                System.out.println("Username already exists");
            }
        }
        if (PasswordValidator.isStrongPassword(password)) {
            System.out.println("Password not strong");
            return false;
        }
        if (!exists) {
            database.addAccount(this);
            System.out.println("Account Registration Successful");
            return true;
        }
        return false;
    }
}