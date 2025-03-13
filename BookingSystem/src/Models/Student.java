package Models;

public class Student implements  User {
    private String email;
    private String password;
//    private String licensePlate;
//    private ParkingSpot parkingSpot;
    private String username;

    public Student(String name, String email, String password) {
        this.username = name;
        this.email = email;
        this.password = password;
    }

    public double getParkingRate() {
        return 5.0; // $5 per hour
    }

    @Override
    public String getEmail() { return email; }

    @Override
    public String getPassword() { return password; }

//    @Override
//    public String getLicensePlate() { return licensePlate; }

//    @Override
//    public ParkingSpot getParkingSpot() { return parkingSpot; }

    @Override
    public String getUsername() { return username; }

//    @Override
//    public Card paymentInformation(String input) {
//        return new Card(input); // Example logic
//    }

    @Override
    public boolean registerAccount() {
        // Implement account registration logic
        return true;
    }
}
