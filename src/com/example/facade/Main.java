package com.example.facade;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer();

        ComputerFacade computerFacade = new ComputerFacade();

        computerFacade.turnOnComputer(computer);
        computerFacade.turnOffComputer(computer);

    }
}
