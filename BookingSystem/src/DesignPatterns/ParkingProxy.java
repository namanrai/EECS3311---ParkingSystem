package DesignPatterns;

import Models.ParkingLot;
import Models.ParkingSpace;
//import Models.Manager;

public class ParkingProxy {
    private ParkingLot parkingLot;
//    private Manager manager;
    private boolean isManager;

    public ParkingProxy(ParkingLot parkingLot, boolean isManager) {
        this.parkingLot = parkingLot;
//        this.manager = new Manager();
        this.isManager = isManager;
    }

    // enable/disable the entire parking lot (restricted to managers)
    public void toggleParkingLot(boolean request) {
        if (isManager) {
//            if (request) {
//                manager.enableParkingLot(parkingLot);
//            } else {
//                manager.disableParkingLot(parkingLot);
//            }
        } else {
            System.out.println("Unauthorized access: Only managers can enable/disable parking lots.");
        }
    }

    //enable/disable a specific parking space (restricted to managers)
    public void toggleParkingSpace(String ID, boolean request) {
        if (isManager) {
            for (ParkingSpace space : parkingLot.getSpaces()) {
//                if (space.getId().equals(ID)) {
//                    if (request) {
//                        manager.enableParkingSpace(space);
//                    } else {
//                        manager.disableParkingSpace(space);
//                    }
//                    break;
//                }
            }
        } else {
            System.out.println("Unauthorized access: Only managers can enable/disable parking spaces.");
        }
    }
}