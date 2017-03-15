package com.codeclan.fastcars;

import java.util.ArrayList;

/**
 * Created by Adam Baxter on 15/03/2017.
 */

public class TopCars {

    private ArrayList<Car> list;


    public TopCars() {


        list = new ArrayList<Car>();

        list.add(new Car("Pagani", "Zonda R", "6:47.50"));
        list.add(new Car("Radical", "SR8 M", "6:48.00"));
        list.add(new Car("Lamborghini", "Huracan Performante", "6:52.00"));
        list.add(new Car("Porsche", "918 Spyder", "6:57.00"));
        list.add(new Car("Ferrari", "599XX", "6:58.16"));
        list.add(new Car("Lamborghini", "Aventador SV", "6:59.73"));
        list.add(new Car("Dodge", "Viper ACR-X", "7:03.06"));
        list.add(new Car("NextEV", "NIO EP9", "7:05.12"));
        list.add(new Car("Nissan", "GTR Nismo", "7:08.68"));
        list.add(new Car("Mercedes", "AMG GT R", "7:10.92"));

    }

    public ArrayList<Car> getList(){
        return new ArrayList<Car>(list);
    }

}

