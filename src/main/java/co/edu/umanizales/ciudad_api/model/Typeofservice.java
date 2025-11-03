package co.edu.umanizales.ciudad_api.model;

// enum
public class Typeofservice {

    // encapsulation
    private String serviceName;
    private int commune;
    private String state;

    // constructor
    public Typeofservice(String serviceName, int commune, String state) {
        this.serviceName = serviceName;
        this.commune = commune;
        this.state = state;
    }

    // getter, used to access encapsulation attributes

    public String getServicename() { return this.serviceName; }
    public int getCommune() { return this.commune; }
    public String getState() { return this.state; }
    //

    @Override
    public String toString() {
        return "Typeofservice{" +
                "serviceName='" + serviceName + '\'' +
                ", commune=" + commune + '\'' +
                ", state=" + state +
                '}';
    }
}






