package co.edu.umanizales.ciudad_api.model;

public class Coordenada {

// record
        private double latitud ;
        private double longitud;

        public Coordenada (double Latitud, double Longitud){
            this.latitud = Latitud;
            this.longitud = Longitud;

        }
        public double getLatitud(){ return this.latitud;}
public double getLongitud(){ return this.longitud;}
    }


