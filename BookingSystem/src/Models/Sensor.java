package Models;

public class Sensor {
    private boolean isCarPresent;
    private String detectedLicensePlate;

    public Sensor() {
        this.isCarPresent = false;
        this.detectedLicensePlate = null;
    }

    public boolean isCarPresent() {
        return isCarPresent;
    }
    public String getDetectedLicensePlate() {
        return detectedLicensePlate;
    }

    public void detectCar(String licensePlate) {
        this.isCarPresent = true;
        this.detectedLicensePlate = licensePlate;
    }

    public void clearDetection() {
        this.isCarPresent = false;
        this.detectedLicensePlate = null;
    }
}
