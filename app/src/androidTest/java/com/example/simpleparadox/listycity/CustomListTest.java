package com.example.simpleparadox.listycity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    private Context appContext;

    @Before
    public void setup() {
        appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        list = new CustomList(appContext, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int size = list.getCount();
        list.addCity(new City("Edmonton", "Alberta"));
        assertEquals(size+1, list.getCount());
    }

    @Test
    public void hasCityTest() {
        City city = new City("Calgary", "Alberta");
        assertFalse(list.hasCity(city));
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    public void deleteCityTest() {
        City city = new City("Toronto", "Ontario");
        list.addCity(city);
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }

    @Test
    public void countCitiesTest() {
        City city = new City("Halifax", "Nova Scotia");
        assertEquals(0, list.citiesCount());
        list.addCity(city);
        assertEquals(1, list.citiesCount());
    }
}
