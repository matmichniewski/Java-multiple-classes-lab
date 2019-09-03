import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void setUp(){
        bus = new Bus("Castle Street", 3);
        person = new Person();
        busStop = new BusStop("Leith");
        busStop.addPerson(person);
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void addPassengerToTheBus(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void cantAddPassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(3, bus.passengerCount());
    }

    @Test
    public void canRemovePassengerFromTheBus(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void pickUpFromTheBusStopAndAddToTheBus(){
        bus.pickUpFromTheBusStop(busStop);
        assertEquals(1, bus.passengerCount());
    }
}
