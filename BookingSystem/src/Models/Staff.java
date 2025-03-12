package Models;

public class Staff extends User {
    public Staff(String name, String email, String password) {
        super(name, email, password);
    }

    public double getParkingRate() {
        return 10.0; // $10 per hour
    }
}