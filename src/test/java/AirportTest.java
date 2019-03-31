import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    private Airport airport;
    private Plane plane;
    private Passenger passenger;
    private Passenger passenger1;
    private Passenger passenger2;
    private Plane testPlane;
    private Flight testFlight;

    @Before

    public void before(){
        airport = new Airport(AirportCode.EDI);
        plane = new Plane(PlaneType.BOING767,AirLine.EASYJET);
        passenger = new Passenger("Steven Middleton");
        passenger1 = new Passenger("Eva Middleton");
        passenger2 = new Passenger("Craig Millar");
        testPlane = new Plane(PlaneType.BOING767,AirLine.EASYJET);
        testFlight = new Flight(testPlane,20,"Amsterdam",500);
    }

    @Test
    public void canAddPlaneToHangar(){
        airport.assignPlaneToHangar(plane);
        assertEquals(1,airport.countPlanes());

    }

    @Test
    public void canCheckHangarSize(){
        airport.assignPlaneToHangar(plane);
        airport.assignPlaneToHangar(plane);
        assertEquals(2,airport.countPlanes());
    }

    @Test
    public void canGetAirportCode(){
        assertEquals(AirportCode.EDI,airport.getAirportCode());
    }

    @Test
    public void  canCreateFlight(){
        Flight flight = airport.createFlight(plane,12,"New York", 100);
        assertEquals(12,flight.getFlightNumber());
    }

    @Test
    public void canRemovePlaneFromHangar(){
        airport.assignPlaneToHangar(plane);
        airport.assignPlaneToHangar(plane);
        airport.removePlaneFromHangar(plane);
        assertEquals(1,airport.countPlanes());
    }

    @Test
    public void canAssignPlaneToFlight(){
        airport.assignPlaneToHangar(plane);
        Flight flight = airport.createFlight(plane, 20, "Tokyo",500);
        assertEquals(plane, flight.getPlane());
        assertEquals(0, airport.countPlanes());
    }

    @Test
    public void canSellTickets(){
        Flight flight = airport.createFlight(plane, 20, "Tokyo",500);
        airport.sellTicket(passenger,flight);
        assertEquals(1,plane.countPassengers());
    }
    @Test
    public void findPassengerTrue(){
        testPlane.addPassenger(passenger);
        testPlane.addPassenger(passenger1);
        testPlane.addPassenger(passenger2);
        assertEquals(true,airport.passengerOnFlight(passenger1,testFlight));
    }

    @Test
    public void findPassengerFalse(){
        testPlane.addPassenger(passenger);
        testPlane.addPassenger(passenger2);
        assertEquals(false,airport.passengerOnFlight(passenger1,testFlight));

    }

}
