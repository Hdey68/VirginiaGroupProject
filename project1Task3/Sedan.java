package com.groupVirginia.project1Task3;

public class Sedan extends Car {
    double salesPrice;
    Sedan (double length, double carPrice) {
        if (length > 20) {
            salesPrice = carPrice - (carPrice * .05);
        } else {
            salesPrice = carPrice - (carPrice * .1);
        }
    }
    @Override
    double CalculateSalesPrice() {
        return salesPrice;
    }
}





