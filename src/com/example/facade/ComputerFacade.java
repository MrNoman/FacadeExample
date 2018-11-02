package com.example.facade;

public class ComputerFacade {
    public void turnOnComputer(Computer computer){
        computer.power.setPoweredOn(true);
        computer.cpu.setPoweredOn (computer);
        computer.ram.setPoweredOn(computer);
        computer.hdd.setPoweredOn(computer);
        computer.plugInDevices.setPoweredOn(computer);

    }

    public void turnOffComputer(Computer computer){
        computer.power.setPoweredOn(false);
        computer.cpu.setPoweredOn (computer);
        computer.ram.setPoweredOn(computer);
        computer.hdd.setPoweredOn(computer);
        computer.plugInDevices.setPoweredOn(computer);
    }
}
