package Models;

public class Faculty extends User {
    public Faculty(String name, String email, String password) {
        super(name, email, password);
    }

    public double getParkingRate() {
        return 8.0; // $8 per hour
    }
}