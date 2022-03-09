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
        City city = new City("Calgary", "Alberta");
        list.addCity(city);
        assertEquals(3, list.getCount());
        list.delete(city);
        assertEquals(2, list.getCount());
        assertFalse(list.hasCity(city));
    }
    }
}
