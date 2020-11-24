package com.groupVirginia.project1Task3;

public class Main {
    public static void main(String[] args) {
        Car car=new Truck(1000,60000);
        System.out.println("Price of Truck : " + car.CalculateSalesPrice());
        Car car1 = new Sedan(18,18000);
        System.out.println("Price of Car : " + car1.CalculateSalesPrice());
    }
}
