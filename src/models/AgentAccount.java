package models;

import interfaces.Account;
import interfaces.ParkingSpot;

public class AgentAccount extends Account {

    public boolean processTicket(ParkingTicket ticket) {
        //add your own impl here
        return false;
    }

    @Override
    public boolean resetPassword() {
        //add your own impl here
        return false;
    }
}
