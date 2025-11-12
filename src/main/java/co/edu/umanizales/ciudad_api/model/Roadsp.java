package co.edu.umanizales.ciudad_api.model;

// make inheritance for employee and zone
public class Roadsp {

    private String damages;
    private Zone zone;
    private String incidents;

    public Roadsp(String Damages, Zone zone, String incidents) {
        this.damages = Damages;
        this.zone = zone;
        this.incidents = incidents;
    }
    public String getDamages() { return this.damages; }
    public String getIncidents() { return this.incidents; }
    public Zone getZone() { return zone; }
    public void setZone(Zone zone) { this.zone = zone; }



    //
    public static Roadsp show() {
        Zone z = new Zone("san lorenzo", "Commune 4", "stratum 2");
        return new Roadsp("Traffic light damaged and two cars with minor front-end damage", z, "five accidents");
    }


}






