import Components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){engine=new Engine(3,"good parts","x3++");
    }

    @Test
    public void canMakeNoise(){
        assertEquals("vrooom!",engine.makeSound());
    }

    @Test
    public void hasPrice(){
        assertEquals(3,engine.getPrice());
    }

    @Test
    public void hasMake(){
        assertEquals("good parts",engine.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("x3++",engine.getModel());
    }
}
