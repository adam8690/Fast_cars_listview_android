package com.codeclan.fastcars;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Adam Baxter on 15/03/2017.
 */

public class TopCarsTest {



    @Test
    public void getListTest(){
        TopCars cars = new TopCars();
        assertEquals(10, cars.getList().size());
    }









}
