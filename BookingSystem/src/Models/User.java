package Models;

public interface User {
    String getEmail();
    String getPassword();
    //String getLicensePlate();
    //ParkingSpot getParkingSpot();
    String getUsername();

    //Card paymentInformation(String input);
    boolean registerAccount();
}
