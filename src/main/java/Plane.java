import java.util.ArrayList;

public class Plane {

    private PlaneType type;
    private AirLine airLine;
    private ArrayList<Passenger> passengers;

    public Plane(PlaneType type, AirLine airLine){
        this.type = type;
        this.airLine = airLine;
        this.passengers = new ArrayList<>();
    }

    public PlaneType getType(){
        return this.type;
    }

    public AirLine getAirLine(){
        return this.airLine;
    }

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public int countPassengers(){
        return this.passengers.size();
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
}
