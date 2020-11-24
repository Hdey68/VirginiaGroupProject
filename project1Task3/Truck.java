package com.groupVirginia.project1Task3;

public class Truck extends Car {
    double salesPrice;
    Truck(double weight, double carPrice) {
        if (weight > 2000) {
            salesPrice = carPrice - (carPrice * .1);
        } else {
            salesPrice = carPrice - (carPrice * .2);
        }
    }
    @Override
    double CalculateSalesPrice() {
        return salesPrice;
    }
}