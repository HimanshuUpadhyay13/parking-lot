package com.parkinglot.commands;

import com.parkinglot.service.SlotService;

public class ClearParkingSlot implements Command {
    private SlotService slotService;

    public ClearParkingSlot(SlotService slotService) {
        this.slotService = slotService;
    }

    public void execute() {
        slotService.clearSlot();
    }
}
