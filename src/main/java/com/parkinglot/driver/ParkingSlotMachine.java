package com.parkinglot.driver;

import com.parkinglot.commands.BookParkingSlotCommand;
import com.parkinglot.commands.CheckSlotCommand;
import com.parkinglot.commands.ClearParkingSlot;
import com.parkinglot.commands.FrontDeskAgent;
import com.parkinglot.model.Slot;
import com.parkinglot.service.SlotService;

import java.util.Scanner;

/**
 * This is the driver and place from where booking process starts
 */
public class ParkingSlotMachine {
    public static void main(String[] args) {
        Slot slot = new Slot(100);
        SlotService slotService = new SlotService(slot);
        BookParkingSlotCommand bookParkingSlotCommand = new BookParkingSlotCommand(slotService);
        ClearParkingSlot clearParkingSlot = new ClearParkingSlot(slotService);
        CheckSlotCommand checkSlotCommand = new CheckSlotCommand(slotService);
        FrontDeskAgent agent = new FrontDeskAgent();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("::::::::::::::::::Welcome:::::::::::::::::::::::::");
            System.out.println("Choose From Below Options \n 1) to book a parking-slot \n 2) Clear a slot\n 3) Are slot available?");
            int choice;
            try {
                choice = sc.nextInt();
            } catch (Exception ex) {
                System.out.println("Oops Invalid Option.....Please try again..");
                break;
            }
            switch (choice) {
                case 1:
                    agent.takeRequest(bookParkingSlotCommand);
                    break;
                case 2:
                    agent.takeRequest(clearParkingSlot);
                    break;
                case 3:
                    agent.takeRequest(checkSlotCommand);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            try {
                agent.processRequest();
            } catch (Exception ex) {
                System.out.println("Please Try Again..");
            }

        }
    }
}
