package com.example.facade;

public class PowerSupply {
    private boolean poweredOn;

    public PowerSupply(){
        this.poweredOn = false;
    }

    public PowerSupply(boolean power){
        this.poweredOn = power;
    }

    public boolean isPoweredOn() {
        return poweredOn;
    }

    public void setPoweredOn(boolean poweredOn) {
        this.poweredOn = poweredOn;
        System.out.println("Power sypply ON");
    }
}
