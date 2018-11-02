package com.example.facade;

public class ComputerFacade {

    private Computer computer = new Computer();


    public void turnOnComputer() {
        computer.getPower().setPoweredOn(true);
        computer.getCpu().setPoweredOn(computer);
        computer.getRam().setPoweredOn(computer);
        computer.getHdd().setPoweredOn(computer);
        computer.getPlugInDevices().setPoweredOn(computer);
    }

    public void turnOffComputer() {
        computer.getPower().setPoweredOn(false);
        computer.getCpu().setPoweredOn(computer);
        computer.getRam().setPoweredOn(computer);
        computer.getHdd().setPoweredOn(computer);
        computer.getPlugInDevices().setPoweredOn(computer);
    }
}

