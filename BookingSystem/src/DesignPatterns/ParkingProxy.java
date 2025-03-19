package DesignPatterns;

import Models.ParkingLot;
import Models.ParkingSpace;

import java.util.ArrayList;
import java.util.List;


public class ParkingProxy {
    private List<ParkingLot> parkingLots;
    private boolean isManager;

    public ParkingProxy(boolean isManager) {
        this.parkingLots = new ArrayList<>();
        this.isManager = isManager;
    }

    //adds parking lot to the list
    public void addParkingLot(String lotID) {
        if (isManager) {
            ParkingLot newLot = new ParkingLot(lotID); // Create a new ParkingLot
            parkingLots.add(newLot); // Add it to the list
            System.out.println("Parking Lot " + lotID + " has been added.");
        } else {
            System.out.println("Unauthorized access: Only managers can add parking lots.");
        }
    }

    //removes parkinglot from list
    public void removeParkingLot(String lotID) {
        if (isManager) {
            ParkingLot lotToRemove = null;
            for (ParkingLot lot : parkingLots) {
                if (lot.getLotId().equals(lotID)) {
                    lotToRemove = lot;
                    break;
                }
            }
            if (lotToRemove != null) { //if the lot is found
                parkingLots.remove(lotToRemove); // Remove the parking lot
                System.out.println("Parking Lot " + lotID + " has been removed.");
            } else {
                System.out.println("Error: Parking Lot " + lotID + " not found.");
            }
        } else {
            System.out.println("Unauthorized access: Only managers can remove parking lots.");
        }
    }

//returns list of parking lots
    public List<ParkingLot> getParkingLots() {
        return parkingLots;
    }

    // enable/disable the entire parking lot (restricted to managers)
    public void toggleParkingLot(String LotID, boolean request) {
        if (isManager) {
            ParkingLot selectedLot = null;
            for (ParkingLot lot : parkingLots) {
                if (lot.getLotId().equals(LotID)) {
                    selectedLot = lot;
                    break;
                }
            }
            if (selectedLot != null) { // if the lot is found
                if (request) {
                    selectedLot.enable(); // Enable the parking lot
                    System.out.println("Parking Lot " + LotID + " is enabled.");
                } else {
                    selectedLot.disable(); // Disable the parking lot
                    System.out.println("Parking Lot " + LotID + " is disabled.");
                }
            } else {
                System.out.println("Error: Parking Lot " + LotID + " not found.");
            }
        } else {
            System.out.println("Unauthorized access: Only managers can enable/disable parking lots.");
        }
    }

    //enable/disable a specific parking space (restricted to managers)
    public void toggleParkingSpace(String LotID, String ID, boolean request) {
        if (isManager) {
            ParkingLot selectedLot = null;
            for (ParkingLot lot : parkingLots) {
                if (lot.getLotId().equals(LotID)) {
                    selectedLot = lot;
                    break;
                }
            }
            if (selectedLot != null) { // if the lot is found
                for (ParkingSpace space : selectedLot.getSpaces()) {
                    if (space.getId().equals(ID)) {
                        if (request) {
                            space.enable(); // Enable the parking space
                            System.out.println("Parking space " + ID + " in " + LotID + " is enabled.");
                        } else {
                            space.disable(); // Disable the parking space
                            System.out.println("Parking space " + ID + " in " + LotID + " is disabled.");
                        }
                        return;
                    }
                }
                System.out.println("Error: Parking space " + ID + " not found in the Lot. ");
            } else {
                System.out.println("Error: Parking Lot " + ID + " not found.");
            }
        } else {
            System.out.println("Unauthorized access: Only managers can enable/disable parking spaces.");
        }
    }
}