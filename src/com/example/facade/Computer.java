package com.example.facade;


public class Computer {
    private PowerSupply power = new PowerSupply();
    private CPU cpu = new CPU();
    private RAM ram = new RAM();
    private HDD hdd = new HDD();
    private PlugInDevices plugInDevices = new PlugInDevices();


    public PowerSupply getPower() {
        return power;
    }

    public CPU getCpu() {
        return cpu;
    }

    public HDD getHdd() {
        return hdd;
    }

    public RAM getRam() {
        return ram;
    }

    public PlugInDevices getPlugInDevices() {
        return plugInDevices;
    }
}
