package Models;
import java.util.Random;

/**
 * This is the class for the manager account. A manager can add, enable, and disable
 * parking spaces and parking lots. The manager username and password are unique
 * and are generated through random number.
 *
 */


public class Manager {
    public String username;
    public String password;
    private static final String userChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    public static int parkingspaces = 0;


    /**
     * Constructor for the class
     */

    public Manager(){
        this.username = generateUsername();
        this.password = generateUserPassword();

    }

    /**
     * This method is used for generating the String user password,
     * satisfying the 2nd user requirement.
     *
     * @return generatedPassword.toString();
     *
     */
    private String generateUserPassword(){
        Random randomgen = new Random();
        StringBuilder generatedPassword = new StringBuilder();

        for (int j = 0; j < 6; j++) {
            generatedPassword.append(randomgen.nextInt(10));
        }

        return generatedPassword.toString();
    }

    /**
     *  This method is used for generating the String user username,
     *  satisfying the 2nd user requirement.
     * @return generatedUser.toString();
     */

    private String generateUsername(){
        int length = userChar.length();

        Random randomgen = new Random();
        StringBuilder generatedUser = new StringBuilder();

        for (int j = 0; j < length; j++) {
            int index = randomgen.nextInt(userChar.length());
            generatedUser.append(userChar.charAt(index));
        }

        return generatedUser.toString();
    }

    /**
     *  This method is used for adding a parking lot when required.
     * @param parkinglot m
     *
     *
     */

    public void addParkinglot(ParkingLot parkinglot){
        if (parkinglot != null){
            parkinglot.enable();
            System.out.println("Parking Lot" + parkinglot.getLotId() + "is enabled");
        }
        else{
            System.out.println("Parking Lot is not valid");
        }


    }

    /**
     *  This method is responsible for disabling a parking lot
     *  when needed by a manager.
     * @param parkinglot m
     *
     */

    public void disableParkinglot(ParkingLot parkinglot){
        if (parkinglot != null){
            parkinglot.disable();
            System.out.println("Parking Lot" + parkinglot.getLotId() + "is disabled");
        }
        else{
            System.out.println("Parking Lot is not valid");
        }

    }

    /**
     *  This method is responsible for disabling a parking sapce
     *  when needed by a manager and reduces the count of that parking space by 1
     * @param parkingspace m
     *
     */

    public void disableParkingspace(ParkingSpace parkingspace){


        if(parkingspace.getId() != null){
            parkingspace.disable();
            System.out.println("Parking space" + parkingspace.getId() + "is disabled");
            parkingspaces--;
        }
        else{
            System.out.println("Parking space not found");
        }

    }

    /**
     *  This method is responsible for disabling a parking sapce
     *  when needed by a manager and increases the count of that parking space by 1
     * @param parkingspace m
     *
     */

    public void enableParkingspace(ParkingSpace parkingspace) {

        if (parkingspaces < 100) {
            parkingspace.enable();
            parkingspaces++;
            System.out.println("parking spot" + parkingspace.getId() + "is enabled");
        }
    }


    public String getName() {
        return username;
    }

    public String getPassword(){
        return password;
    }









}
