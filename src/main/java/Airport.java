import java.util.ArrayList;

public class Airport {

    private ArrayList<Plane> hangar;
    private AirportCode airportCode;

    public Airport(AirportCode airportCode){
        this.airportCode =  airportCode;
        this.hangar = new ArrayList<>();
    }

    public void addPlane(Plane plane){
        this.hangar.add(plane);
    }

    public int countPlanes(){
        return this.hangar.size();
    }

    public AirportCode getAirportCode(){
        return this.airportCode;
    }

}
