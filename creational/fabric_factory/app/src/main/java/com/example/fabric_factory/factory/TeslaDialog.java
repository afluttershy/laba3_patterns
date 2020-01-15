package com.example.fabric_factory.factory;
import com.example.fabric_factory.cars.Car;
import com.example.fabric_factory.cars.Tesla;

public class TeslaDialog extends Dialog {

    @Override
    public Car createCar() {
        return new Tesla();
    }
}
