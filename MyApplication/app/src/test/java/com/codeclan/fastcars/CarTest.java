package com.codeclan.fastcars;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Adam Baxter on 15/03/2017.
 */

public class CarTest {

    Car car;

    @Before
    public void before(){
        car = new Car("Mini", "John Cooper Works", "9:00:00");
    }

    @Test
    public void testCarHasName(){
        assertEquals(car.getManufacturer(), "Mini");
    }

    @Test
    public void testCarHasModel(){
        assertEquals(car.getModel(), "John Cooper Works");
    }

    @Test
    public void testCarHasLAptime(){
        assertEquals(car.getLapTime(), "9:00:00");
    }











}
