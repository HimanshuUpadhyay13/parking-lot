package com.parkinglot.service;

import com.parkinglot.model.Slot;
import com.parkinglot.utils.AppCommonUtils;

public class SlotService {

    private Slot slots;

    public SlotService(Slot slots) {
        this.slots = slots;
    }

    public void bookSlot() {
        this.slots.setTotalSlots(this.slots.getTotalSlots() - 1);
        System.out.println("Your Parking Request Id is : " + AppCommonUtils.generateUID());
    }

    public void clearSlot() {
        this.slots.setTotalSlots(this.slots.getTotalSlots() + 1);
        System.out.println("Slot cleared....");
    }

    public void getSlots() {
        System.out.println("Available slots:" + this.slots.getTotalSlots());
    }

}
