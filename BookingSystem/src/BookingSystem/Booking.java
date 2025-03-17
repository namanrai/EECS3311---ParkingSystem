package BookingSystem;

public class Booking {
    private String bookingId;
    private User user;
    private ParkingSpace parkingSpace;
    private String startTime;
    private String endTime;
    private boolean isPaid;
    private boolean isCancelled;

    public Booking(String bookingId, User user, ParkingSpace parkingSpace, String startTime, String endTime) {
        this.bookingId = bookingId;
        this.user = user;
        this.parkingSpace = parkingSpace;
        this.startTime = startTime;
        this.endTime = endTime;
        this.isPaid = false;
        this.isCancelled = false;
    }

    public String getBookingId() {
        return bookingId;
    }

    public User getUser() {
        return user;
    }

    public ParkingSpace getParkingSpace() {
        return parkingSpace;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void markAsPaid() {
        this.isPaid = true;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void cancelBooking() {
        if (!isPaid) {
            this.isCancelled = true;
        }
    }

    public void extendBooking(String newEndTime) {
        int currentEndTimeInSeconds = Integer.parseInt(this.endTime);
        int newEndTimeInSeconds = Integer.parseInt(newEndTime);
        
        if (newEndTimeInSeconds > currentEndTimeInSeconds) {
            this.endTime = newEndTime;
        }
    }
}