package com.example.fabric_factory.factory;
import com.example.fabric_factory.cars.Car;

public abstract class Dialog {

    public void renderCar(){
        Car okCar = createCar();
        okCar.render();
    }
    public abstract Car createCar();
}
