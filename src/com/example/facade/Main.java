package com.example.facade;

public class Main {

    public static void main(String[] args) {

        ComputerFacade computerFacade = new ComputerFacade();

        computerFacade.turnOnComputer();
        computerFacade.turnOffComputer();

    }
}
