package com.example.simpleparadox.listycity;

import static org.junit.Assert.assertEquals;

import android.content.Context;

import androidx.test.filters.SmallTest;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;

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

}
