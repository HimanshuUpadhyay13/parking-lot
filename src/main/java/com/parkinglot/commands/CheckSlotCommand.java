package com.parkinglot.commands;

import com.parkinglot.service.SlotService;

public class CheckSlotCommand implements Command {

    private SlotService slotService;

    public CheckSlotCommand(SlotService slotService)
    {
        this.slotService=slotService;
    }

    public void execute() {
        slotService.getSlots();
    }
}
