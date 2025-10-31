package co.edu.umanizales.ciudad_api.model;
// CLASES
public class TransporteP {
    private String ruta;
    private int cantidadpasajeros;



    public TransporteP (String Ruta , int Cantidadpasajeros) {
        this.ruta = Ruta;
        this.cantidadpasajeros = Cantidadpasajeros;
}
    // getter, es para utilizar los atributos del encaposulamiento
public String getRuta() {
    return this.ruta;
}
public int getCantidadpasajeros() {
        return  this.cantidadpasajeros;
}

    //
    @Override
    public String   toString() {
        return "TransporteP{" +
                "ruta='" + ruta + '\'' +
                ", cantidadPasajeros=" + cantidadpasajeros +
                '}';
    }
}


