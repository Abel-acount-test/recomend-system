package com.example.util;

import com.example.model.entity.Car;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

enum CarBranch{
    NISSAN, TOYOTA, YARIS, HUNDAY, CANTER, TESLA, CONDOR, FERRARI;
}
public class AddObject {
    public static List<Car> getListCar(int end){
        List<Car> carList= new ArrayList<>();
        for (int i=0; i<end; i++){
            String model="M0"+i;
            String branch=CarBranch.values()[((int)(Math.random()*CarBranch.values().length))].name();
            int year=(int)(Math.random()*1990+34);
            double price=((int)((Math.random()*30_000+30_000)*10));
            price/=10;
            int star=(int)(Math.random()*5);
            carList.add(new Car(model, branch, year, price, star));
        }
        return carList;
    }
}
