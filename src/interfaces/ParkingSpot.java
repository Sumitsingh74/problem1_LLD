package interfaces;

public abstract class ParkingSpot {
    private int id;
    private boolean isFree;
    private Vehicle vehicle;

    // abstract functions
    public abstract boolean getIsFree();
}
