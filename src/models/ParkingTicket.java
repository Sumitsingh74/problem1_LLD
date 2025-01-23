package models;

import interfaces.Payment;
import interfaces.Vehicle;

import java.util.Date;

public class ParkingTicket {
    private int ticketNo;
    private Date extryTimestamp;
    private Date exitTimestamp;
    private double amount;
    private boolean status;

    ///iske alawa or k k chahoye hoga
    private Vehicle vehicle;
    private Payment payment;
    private Entrance entrance;
    private Exit exit;
}
