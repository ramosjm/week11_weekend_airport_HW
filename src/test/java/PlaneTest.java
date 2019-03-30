import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;
    private Passenger passenger;

    @Before
    public void before(){
        plane = new Plane(PlaneType.AIRBUSA300,AirLine.EASYJET);
        passenger = new Passenger("Tracey");
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.AIRBUSA300,plane.getType());
    }

    @Test
    public void canGetAirLine(){
        assertEquals(AirLine.EASYJET,plane.getAirLine());
    }

    @Test
    public void canAddPassenger(){
        plane.addPassenger(passenger);
        assertEquals(1,plane.countPassengers());
    }
}
