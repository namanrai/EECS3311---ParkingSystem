package DesignPatterns;

import Models.ParkingLot;
import Models.ParkingSpace;

public class ParkingFacade {
    private ParkingLot parkingLot;

    public ParkingFacade(String lotId) {
        this.parkingLot = new ParkingLot(lotId);
    }

    // assign a car to a parking space
    public boolean assignCar(String licensePlate) {
        ParkingSpace space = parkingLot.findAvailableSpace();
        if (space != null) {
            space.assign(licensePlate);
            return true;
        }
        return false;
    }

    // vacate a parking space
    public void vacateParkingSpace(String ID) {
        for (ParkingSpace space : parkingLot.getSpaces()) {
            if (space.getId().equals(ID)) {
                space.vacate();
                break;
            }
        }
    }

    // to check if the parking lot is disabled
    public boolean isParkingLotDisabled() {
        return parkingLot.isDisabled();
    }
}