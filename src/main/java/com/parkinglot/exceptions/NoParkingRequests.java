package com.parkinglot.exceptions;

public class NoParkingRequests extends RuntimeException {
    public NoParkingRequests(String parkingRequestError) {
        super(parkingRequestError);
    }
}
