import java.util.ArrayList;

public class Airport {

    private ArrayList<Plane> hangar;
    private AirportCode airportCode;

    public Airport(AirportCode airportCode){
        this.airportCode =  airportCode;
        this.hangar = new ArrayList<>();
    }

    public void assignPlaneToHangar(Plane plane){
        this.hangar.add(plane);
    }

    public int countPlanes(){
        return this.hangar.size();
    }

    public AirportCode getAirportCode(){
        return this.airportCode;
    }

    public void removePlaneFromHangar(Plane plane){
         this.hangar.remove(plane);
    }

    public Flight createFlight(Plane plane, int flightNumber, String destination, int price){
        this.removePlaneFromHangar(plane);
        Flight newFlight = new Flight(plane,flightNumber,destination,price);
        return newFlight;

    }

    public void sellTicket(Passenger passenger, Flight flight){
        Plane plane = flight.getPlane();
        if(plane.getType().getCapacity() > plane.countPassengers()){
            plane.addPassenger(passenger);
        }

    }

}
