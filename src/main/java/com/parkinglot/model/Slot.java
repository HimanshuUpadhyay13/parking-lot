package com.parkinglot.model;

public class Slot {
    private int totalSlots;

    public Slot(int totalSlots) {
        this.totalSlots = totalSlots;
    }

    public int getTotalSlots() {
        return totalSlots;
    }

    public void setTotalSlots(int totalSlots) {
        this.totalSlots = totalSlots;
    }
}
