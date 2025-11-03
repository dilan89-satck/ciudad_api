package co.edu.umanizales.ciudad_api.model;

// COMPOSICION
public class Zone {
private String neighborhood;
private String commune;
private String stratum;

public Zone(String Neighborhood, String Commune, String Stratum){
    this.neighborhood = Neighborhood;
    this.commune = Commune;
    this.stratum= Stratum;
}
    public String getNeighborhood() { return this.neighborhood;}
    public String getCommune() { return  this.commune;}
    public  String getStratum() { return this.stratum;}


    public void setNeighborhood(String neighborhood){ this.neighborhood = neighborhood;}
    public void setCommune(String Comune){ this.commune = commune;}
    public void setStratum(String Stratum) { this.stratum = stratum;}

    public static Zone Mostrar(){
        return new Zone("siloe", "commune 8 ", "stratum 6");
    }
}

