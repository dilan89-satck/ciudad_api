package co.edu.umanizales.ciudad_api.model;

public class Incident {


    private String description;
    private Zone zone;
    private int affectedPeople;
    private int incidentCost;

    public Incident(String description, Zone zone, int affectedPeople, int incidentCost) {
        this.description = description;
        this.zone = zone;
        this.affectedPeople = affectedPeople;
        this.incidentCost = incidentCost;
    }
    public String getDescription() { return this.description; }
    public Zone getZone() { return zone; }
    public int getAffectedPeople() { return this.affectedPeople; }
    public int getIncidentCost() { return this.incidentCost; }


    public void setZone(Zone zone) { this.zone = zone; }


    public static Incident show() {
        Zone a = new Zone("maria", "Commune 4", "stratum 2");
        return new Incident("truck without lights", a, 100, 5000);
    }}

