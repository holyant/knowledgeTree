package com.holyant.abstractfactory;

/**
 * @author holyant
 */
public class Customer {
    public static void main(String[] args) {
        FactoryBMW factoryBMW = new FactoryBMW320();
        BMW320 bmw320 = (BMW320)factoryBMW.createBMW();

        factoryBMW = new FactoryBMW523();
        BMW523 bmw523 = (BMW523)factoryBMW.createBMW();

    }
}