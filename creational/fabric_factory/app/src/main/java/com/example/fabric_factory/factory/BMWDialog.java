package com.example.fabric_factory.factory;
import com.example.fabric_factory.cars.BMW;
import com.example.fabric_factory.cars.Car;

public class BMWDialog extends Dialog {

    @Override
    public Car createCar() {
        return new BMW();
    }
}