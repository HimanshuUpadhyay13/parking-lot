package com.parkinglot.commands;

import com.parkinglot.service.SlotService;

public class BookParkingSlotCommand implements Command {

    private SlotService slotService;

    public BookParkingSlotCommand(SlotService slotService)
    {
        this.slotService=slotService;
    }

    public void execute() {
        slotService.bookSlot();
    }
}
