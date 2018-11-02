package com.example.facade;

public class CPU {
    private boolean poweredON;

    public CPU (){
        this.poweredON = false;
    }

    public boolean isPoweredOn() {
        return poweredON;
    }


    public void setPoweredOn(boolean poweredOn) {
        this.poweredON = poweredOn;
        System.out.println("CPU ON");
    }

    public void setPoweredOn(Computer computer) {
        if (computer.getPower().isPoweredOn()) {
            this.poweredON = true;
            System.out.println("CPU ON");}
            else
        {
            this.poweredON = false;
            System.out.println("PWR SUPPLY OFF -> CPU OFF");
        }

    }
}
