package com.example.order;

import com.example.model.entity.Car;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderObject {
    private List<Car> carList;

    public OrderObject(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> getListOrderByPrice(){
        List<Car> orderListObject=carList;
        Collections.sort(carList, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getPrice().compareTo(o2.getPrice());
            }
        });
        return orderListObject;
    }
}
