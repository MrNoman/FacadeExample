package com.example.facade;

public class PlugInDevices {
    private boolean poweredON;

    public PlugInDevices (){
        this.poweredON = false;
    }

    public boolean isPoweredOn() {
        return poweredON;
    }


    public void setPoweredOn(boolean poweredOn) {
        this.poweredON = poweredOn;
        System.out.println("Plug-in devices ON");
    }

    public void setPoweredOn(Computer computer) {
        if (computer.getHdd().isPoweredOn()) {
            this.poweredON = true;
            System.out.println("Plug-in devices ON");}
        else
        {
            this.poweredON = false;
            System.out.println("HDD OFF -> Plug-in devices OFF");
        }

    }
}
