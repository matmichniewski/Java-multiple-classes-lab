import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    Person person;
    BusStop busStop;

    @Before
    public void before(){
        person = new Person();
        busStop = new BusStop("Leith");
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, busStop.queueCount());
    }

    @Test
    public void addPersonToTheQueue(){
        busStop.addPerson(person);
        assertEquals(1, busStop.queueCount());
    }

    @Test
    public void removePersonFromTheQueue(){
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.removePerson();
        assertEquals(1, busStop.queueCount());
    }

}
