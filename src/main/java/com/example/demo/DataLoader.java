package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CarRepository repository;

    @Override
    public void run(String...strings) throws Exception{
        Car car = new Car(1992, "Cadillac", "XM");
        repository.save(car);
        car = new Car(2012, "Kia", "Soul");
        repository.save(car);
        car = new Car(2019, "Tesla", "S");
        repository.save(car);
        car = new Car(2018, "Hyundai", "SantaFe");
        repository.save(car);

    }

}
