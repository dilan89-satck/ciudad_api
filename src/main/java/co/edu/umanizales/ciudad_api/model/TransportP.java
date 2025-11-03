package co.edu.umanizales.ciudad_api.model;
// CLASES
public class TransportP {
    private String route;
    private int numberpassengers;
private int numberdrivers;


    public TransportP(String Route , int Numberpassengers, int Numberdrivers) {
        this.route = Route;
        this.numberpassengers = Numberpassengers;
        this.numberdrivers= Numberdrivers;
}
    // getter, es para utilizar los atributos del encaposulamiento
public String getRoute() {return this.route;}
public int getNumberpassengers() { return  this.numberpassengers;}
    public int getNumberdrivers() {return this.numberdrivers;}

    //
    @Override
    public String   toString() {
        return "TransporteP{" +
                "='route" + route + '\'' +
                ", =numberpassengers" + numberpassengers + "numberdrivers" + numberdrivers +
                '}';
    }
}


