package com.example;

import com.example.util.AddObject;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        AddObject.getListCar(40).forEach(System.out::println);
    }
}