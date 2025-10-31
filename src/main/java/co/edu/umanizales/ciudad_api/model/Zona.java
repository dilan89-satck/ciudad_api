package co.edu.umanizales.ciudad_api.model;

// COMPOSICION
public class Zona {
private String barrio;
private String comuna;
private String estrato;

public Zona (String Barrio, String Comuna, String Estrato){
    this.barrio = Barrio;
    this.comuna = Comuna;
    this.estrato= Estrato;
}
    public String getBarrio() { return this.barrio;}
    public String getComuna() { return  this.comuna;}
    public  String getEstrato() { return this.estrato;}


}

