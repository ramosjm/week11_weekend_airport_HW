import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane;

    @Before
    public void before (){
        plane = new Plane(PlaneType.BOING767,AirLine.KLM);
        flight = new Flight(plane,12,"Amsterdam");
    }

    @Test
    public void canGetPlane(){
        assertEquals(plane,flight.getPlane());
    }
}
