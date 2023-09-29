package com.example.postgresqldemo.dto;

import com.example.postgresqldemo.model.PassengerInfo;
import com.example.postgresqldemo.model.PaymentInfo;

public class FlightBookingRequest {

    private PassengerInfo passengerInfo;
    private PaymentInfo paymentInfo;

    public PassengerInfo getPassengerInfo() {
        return passengerInfo;
    }

    public void setPassengerInfo(PassengerInfo passengerInfo) {
        this.passengerInfo = passengerInfo;
    }

    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public FlightBookingRequest(PassengerInfo passengerInfo, PaymentInfo paymentInfo) {
        this.passengerInfo = passengerInfo;
        this.paymentInfo = paymentInfo;
    }
}
