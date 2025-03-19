package Models;
import DesignPatterns.ParkingProxy;

import java.util.Random;

/**
 * This is the class for the manager account. A manager can add, enable, and disable
 * parking spaces and parking lots. The manager username and password are unique
 * and are generated through random number.
 *
 */


public class Manager {
    private final ParkingProxy access;
    public String username;
    public String password;
    private static final String userChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
//    public static int parkingspaces = 0;


    /**
     * Constructor for the class
     */

    public Manager(ParkingProxy access) {
        this.username = generateUsername();
        this.password = generateUserPassword();
        this.access = access; // Initialize ParkingProxy
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
     *
     *
     *
     */

    public void addParkingLot(String lotID) {
        access.addParkingLot(lotID);
    }

    /**
     *  This method is used for removing a parking lot when required.
     *
     *
     *
     */

    public void removeParkingLot(String lotID) {
        access.removeParkingLot(lotID);
    }


    /**
     *  This method is responsible for enabling a parking lot
     *  when needed by a manager.
     *
     *
     */


    public void enableParkinglot(String lotID){
        access.toggleParkingLot(lotID, true);
    }

    /**
     *  This method is responsible for disabling a parking lot
     *  when needed by a manager.
     *
     *
     */

    public void disableParkinglot(String lotID){
        access.toggleParkingLot(lotID, false);
    }

    /**
     *  This method is responsible for disabling a parking sapce
     *  when needed by a manager and reduces the count of that parking space by 1
     *
     *
     */

    public void disableParkingspace(String LotID, String SpaceID){
        access.toggleParkingSpace(LotID, SpaceID, false);
    }

    /**
     *  This method is responsible for disabling a parking sapce
     *  when needed by a manager and increases the count of that parking space by 1
     *
     *
     */

    public void enableParkingspace(String LotID, String SpaceID) {
        access.toggleParkingSpace(LotID, SpaceID, true);
    }


    public String getName() {
        return username;
    }

    public String getPassword(){
        return password;
    }









}
