package edu.cs.birzeit.dynamic_app2.model;

import java.util.ArrayList;

public class CarModel {
    private ArrayList<Car> cars = new ArrayList<>();

    public CarModel(){
        cars.add(new Car("SUV", "KIA Sprento", 2020));
        cars.add(new Car("SUV", "Fanta Fe", 2015));
        cars.add(new Car("Sedan", "Accent", 2017));
        cars.add(new Car("Hatch-Bag", "VW Golf", 2019));

    }
    public ArrayList<Car> getCarsByType(String type){
        ArrayList<Car> result = new ArrayList<>();
        for(Car c : cars){
            if(c.getType().equals(type)){
                result.add(c);
            }
        }
        return result;
    }
}
