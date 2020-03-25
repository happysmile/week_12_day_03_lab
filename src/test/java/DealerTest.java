import Capitalists.Customer;
import Capitalists.Dealer;
import Vehicles.Car;
import Vehicles.Vehicle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Car car;

    @Before
    public void before(){ dealer = new Dealer("Fran's cars",1234567.98);
                            car = new Car(50,"blue","Fiat","500");
    }

    @Test
    public void hasName(){assertEquals("Fran's cars", dealer.getName());}

    @Test
    public void hasMoney(){assertEquals(1234567.98, dealer.getMoney(), 0.01);}

    @Test
    public void hasVehicles(){assertEquals(0, dealer.getVehicles().size());}

    @Test
    public void canAddVehicle(){
        dealer.addVehicle(car);
        assertEquals(1,dealer.getVehicles().size());
    }

    @Test
    public void canSpendMoney(){
        dealer.spendMoney(car.getPrice());
        assertEquals(1234517.98, dealer.getMoney(),0.01);
    }

    @Test
    public void canBuyVehicle(){
        assertEquals(0,dealer.getVehicles().size());
        assertEquals(1234567.98,dealer.getMoney(),0.01);
        dealer.buyVehicle(car);
        assertEquals(1,dealer.getVehicles().size());
        assertEquals(1234517.98,dealer.getMoney(),0.01);
    }

    @Test
    public void canSellVehicle(){
        Customer customer = new Customer("john",200);
        dealer.addVehicle(car);
        dealer.sellVehicle(customer,car);
        assertEquals(1,customer.getVehicles().size());
        assertEquals(0,dealer.getVehicles().size());
        assertEquals(150,customer.getMoney(),0.01);
        assertEquals(1234617.98,dealer.getMoney(),0.01);


    }

}
