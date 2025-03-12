package Models;

public class Visitor extends User {
    public Visitor(String name, String email, String password) {
        super(name, email, password);
    }

    public double getParkingRate() {
        return 15.0; // $15 per hour
    }
}
