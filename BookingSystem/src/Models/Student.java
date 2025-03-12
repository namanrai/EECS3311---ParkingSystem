package Models;

public class Student extends User {
    public Student(String name, String email, String password) {
        super(name, email, password);
    }

    public double getParkingRate() {
        return 5.0; // $5 per hour
    }
}
