package com.example.facade;


public class Computer {
    public PowerSupply power = new PowerSupply();
    public CPU cpu = new CPU();
    public RAM ram = new RAM();
    public HDD hdd = new HDD();
    public PlugInDevices plugInDevices = new PlugInDevices();
}
