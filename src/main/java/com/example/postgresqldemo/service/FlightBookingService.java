package com.example.postgresqldemo.service;

import com.example.postgresqldemo.dto.FlightBookingAcknowledgement;
import com.example.postgresqldemo.dto.FlightBookingRequest;
import com.example.postgresqldemo.model.PassengerInfo;
import com.example.postgresqldemo.model.PaymentInfo;
import com.example.postgresqldemo.repository.PassengerInfoRepository;
import com.example.postgresqldemo.repository.PaymentInfoRepository;
import com.example.postgresqldemo.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class FlightBookingService {
    @Autowired
    private PaymentInfoRepository paymentInfoRepository;
    @Autowired
    private PassengerInfoRepository passengerInfoRepository;

    public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest flightBookingRequest) {
      //  FlightBookingAcknowledgement flightBookingAcknowledgement = null;
        PassengerInfo passengerInfo = flightBookingRequest.getPassengerInfo();
        passengerInfo = passengerInfoRepository.save(passengerInfo);
        PaymentInfo paymentInfo = flightBookingRequest.getPaymentInfo();

        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(),passengerInfo.getFare());
        paymentInfo.setPassengerId(passengerInfo.getPId());
        paymentInfo.setAmount(passengerInfo.getFare());
        paymentInfoRepository.save(paymentInfo);
        return new FlightBookingAcknowledgement("SUCCESS",passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0],passengerInfo);

    }
}
