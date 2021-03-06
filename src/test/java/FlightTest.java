import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane;

    @Before
    public void before (){
        plane = new Plane(PlaneType.BOING767,AirLine.KLM);
        flight = new Flight(plane,12,"Amsterdam",50);
    }

    @Test
    public void canGetPlane(){
        assertEquals(plane,flight.getPlane());
    }

    @Test
    public void canGetFlightNumber(){
        assertEquals(12,flight.getFlightNumber());
    }

    @Test
    public void canGetDestination(){
        assertEquals("Amsterdam",flight.getDestination());
    }

    @Test
    public void canGetPrice(){
        assertEquals(50,flight.getPrice());
    }
}
