package com.page.hongjae;

import com.page.hongjae.vehicle.Bus;
//import com.page.hongjae.vehicle.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HongjaeApplication {

    public static void main(String[] args) {
        SpringApplication.run(HongjaeApplication.class, args);
        System.out.println("hello world!");

        Bus bus = new Bus();
        System.out.println(bus);


//        Car car = new Car();
//        System.out.println(car);
    }

}
