import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    private Airport airport;
    private Plane plane;

    @Before

    public void before(){
        airport = new Airport(AirportCode.EDI);
    }

    @Test
    public void canAddPlaneToHangar(){
        airport.addPlane(plane);
        assertEquals(1,airport.countPlanes());

    }

    @Test
    public void canCheckHangarSize(){
        airport.addPlane(plane);
        airport.addPlane(plane);
        assertEquals(2,airport.countPlanes());
    }

    @Test
    public void canGetAirportCode(){
        assertEquals(AirportCode.EDI,airport.getAirportCode());
    }
}
