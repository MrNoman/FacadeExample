package com.example.facade;

public class RAM {
    private boolean poweredON;

    public RAM (){
        this.poweredON = false;
    }

    public boolean isPoweredOn() {
        return poweredON;
    }

    public void setPoweredOn(Computer computer) {
        if (computer.getCpu().isPoweredOn()) {
            this.poweredON = true;
            System.out.println("RAM ON");}
        else
        {
            this.poweredON = false;
            System.out.println("CPU OFF -> RAM OFF");
        }

    }
}
