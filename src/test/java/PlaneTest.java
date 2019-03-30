import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;
    private Passenger passenger1;
    private Passenger passenger2;

    @Before
    public void before(){
        plane = new Plane(PlaneType.AIRBUSA300,AirLine.EASYJET);
        passenger1 = new Passenger("Steve");
        passenger2= new Passenger("Tracey");
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
        plane.addPassenger(passenger1);
        assertEquals(1,plane.countPassengers());
    }

    @Test
    public void canGetPassengers(){
        plane.addPassenger(passenger1);
        plane.addPassenger(passenger2);
        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(passenger1);
        passengers.add(passenger2);
        assertEquals(passengers,plane.getPassengers());

    }
}
