package co.edu.umanizales.ciudad_api.model;

// COMPOSITION
public class Zone {
    private String neighborhood;
    private String commune;
    private String stratum;

    public Zone(String neighborhood, String commune, String stratum) {
        this.neighborhood = neighborhood;
        this.commune = commune;
        this.stratum = stratum;
    }
    public String getNeighborhood() { return this.neighborhood; }
    public String getCommune() { return this.commune; }
    public String getStratum() { return this.stratum; }


    public void setNeighborhood(String neighborhood) { this.neighborhood = neighborhood; }
    public void setCommune(String commune) { this.commune = commune; }
    public void setStratum(String stratum) { this.stratum = stratum; }

    public static Zone show() {
        return new Zone("siloe", "commune 8 ", "stratum 6");
    }
}

