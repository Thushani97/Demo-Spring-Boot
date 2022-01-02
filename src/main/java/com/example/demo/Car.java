package com.example.demo;

// alt + insert ---> to add getter and setter
public class Car {
    public Car() {

    }
    public Car(String carId, String carName, String carColor) {
        this.carId = carId;
        this.carName = carName;
        this.carColor = carColor;
    }

    public String getCarId() {
        return carId;
    }

    public String getCarName() {
        return carName;
    }

    public String getCarColor() {
        return carColor;
    }

    private String carId;
    private String carName;
    private String carColor;

}
