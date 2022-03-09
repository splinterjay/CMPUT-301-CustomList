import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null,new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax","NS"));
        assertEquals(listSize+1,list.getCount());
    }

    @Test
    public void hasCity(){
        City city = new City("Vancouver", "BC");
        list.addCity(city);
        assertEquals(true,list.hasCity(city));
    }

    @Test
    public void deleteCity(){
        City city = new City("Calgary", "AB");
        list.addCity(city);
        assertEquals(1, list.getCount());
        list.delete(city);
        assertEquals(0, list.getCount());
        assertFalse(list.hasCity(city));
    }

    @Test
    public void testcountCities(){
        City  city  = new City("Coquitlam", "British Columbia");
        assertEquals(0,list.countCities());
        list.addCity(city);
        assertEquals(1,list.countCities());
        list.delete(city);
        assertEquals(0,list.countCities());
    }
}
