package co.edu.umanizales.ciudad_api.model;
// CLASSES
public class TransportP {
    private String route;
    private int numberPassengers;
    private int numberDrivers;


    public TransportP(String route, int numberPassengers, int numberDrivers) {
        this.route = route;
        this.numberPassengers = numberPassengers;
        this.numberDrivers = numberDrivers;
    }
    // getter, used to access encapsulation attributes
    public String getRoute() { return this.route; }
    public int getNumberpassengers() { return this.numberPassengers; }
    public int getNumberdrivers() { return this.numberDrivers; }

    //
    @Override
    public String toString() {
        return "TransportP{" +
                "route='" + route + '\'' +
                ", numberPassengers=" + numberPassengers +
                ", numberDrivers=" + numberDrivers +
                '}';
    }
}


