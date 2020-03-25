import Components.Engine;
import Vehicles.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void before(){
        car = new Car(500, "red", "Ford", "Fiesta");
    }

    @Test
    public void hasMake(){
        assertEquals("Ford", car.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Fiesta", car.getModel());
    }

    @Test
    public void hasColour(){
        assertEquals("red", car.getColour());
    }

    @Test
    public void hasPrice(){
        assertEquals(500, car.getPrice());
    }

    @Test
    public void hasArrayOfComponents(){
        assertEquals(0, car.getNumberOfComponents());
    }

    @Test
    public void canAddComponent(){
        Engine engine= new Engine(4,"ferrari","engine");
        car.addComponent(engine);
        assertEquals(1,car.getNumberOfComponents());
    }

}
