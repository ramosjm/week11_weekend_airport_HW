public class Flight {

    private Plane plane;
    private int flightNumber;
    private String destination;
    private int price;

    public Flight(Plane plane, int flightNumber, String destination, int price){
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.price = price;
    }

    public Plane getPlane(){
        return this.plane;
    }

    public int getFlightNumber(){
        return this.flightNumber;
    }

    public String getDestination(){
        return this.destination;
    }

    public int getPrice(){
        return this.price;
    }
}
