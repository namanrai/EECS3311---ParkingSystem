package Models;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private String lotId;
    private List<ParkingSpace> spaces;
    private boolean isDisabled;
    private static final int NUM_SPACES = 100;

    public ParkingLot(String lotId) {
        this.lotId = lotId;
        this.spaces = new ArrayList<>(NUM_SPACES);
        this.isDisabled = false;
        for (int i = 1; i <= NUM_SPACES; i++) {
            spaces.add(new ParkingSpace(lotId + "-" + i, "lot-" + i));
        }
    }

    public String getLotId() {
        return lotId;
    }

    public List<ParkingSpace> getSpaces() {
        return spaces;
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public void disable() {
        this.isDisabled = true;
    }

    public void enable() {
        this.isDisabled = false;
    }

    public ParkingSpace findAvailableSpace() {
        for (ParkingSpace space : spaces) {
            if (!space.isOccupied() && !space.isDisabled()) {
                return space;
            }
        }
        return null;
    }
}