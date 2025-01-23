package models;

import interfaces.Payment;

public class CardPayment extends Payment {
    @Override
    public boolean initiateTransaction() {
        //add your own impl here
        return false;
    }
}
