package com.parkinglot.commands;

import com.parkinglot.exceptions.NoParkingRequests;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the person that will take commands and process them.
 */
public class FrontDeskAgent {

    private List<Command> parkingRequests = new ArrayList<>();

    public void takeRequest(Command command) {
        parkingRequests.add(command);
    }

    public void processRequest() {
        if (parkingRequests.isEmpty())
            throw new NoParkingRequests("No Parking request to process");
        parkingRequests.forEach((Command::execute));
        parkingRequests.clear();
    }
}
