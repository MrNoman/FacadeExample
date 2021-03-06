package com.example.facade;

public class HDD {
    private boolean poweredON;

    public HDD (){ this.poweredON = false; }

    public boolean isPoweredOn() {
        return poweredON;
    }

    public void setPoweredOn(Computer computer) {
        if (computer.getRam().isPoweredOn()) {
            this.poweredON = true;
            System.out.println("HDD ON");}
        else
        {
            this.poweredON = false;
            System.out.println("RAM OFF -> HDD OFF");
        }

    }
}
