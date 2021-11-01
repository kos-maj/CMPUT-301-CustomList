package com.example.simpleparadox.listycity;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @Before
    public void createList() {
        list = new CustomList(null, new ArrayList<>());
    }

    @Test
    public void addCityTest() {
        int size = list.getCount();
        list.addCity(new City("Edmonton", "Alberta"));
        assertEquals(size+1, list.getCount());
    }
}
