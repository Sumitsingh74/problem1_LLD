package models;

import interfaces.ParkingSpot;

public class Compact extends ParkingSpot {
    @Override
    public boolean getIsFree() {
        //add your own implementation here
        return false;
    }
}
