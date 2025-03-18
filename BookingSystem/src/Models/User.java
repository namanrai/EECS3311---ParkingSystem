package Models;

public interface User {
    String getEmail();
    String getPassword();
    String getLicensePlate();
    ParkingSpace getParkingSpace();
    String getUsername();

    //Card paymentInformation(String input);
    boolean registerAccount(String username, String password);
}
