package org.example;

import org.example.BonusService;

public class Main
{
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;

        long calculate = service.calculate(amount, registered);
    }
}

