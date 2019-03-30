import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Dave");
    }

    @Test
    public void canGetName(){
        assertEquals("Dave",passenger.getName());
    }
}
