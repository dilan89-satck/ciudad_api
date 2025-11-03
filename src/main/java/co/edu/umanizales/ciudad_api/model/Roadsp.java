package co.edu.umanizales.ciudad_api.model;

// hacer herencia para empleado y zona
public class Roadsp {

        private String damages;
        private Zone zone;
        private String incidents;

        public Roadsp(String Damages, Zone zone, String Incidents){
            this.damages = Damages;
            this.zone = zone;
            this.incidents= Incidents;
        }
        public String getDamages() { return this.damages;}
        public  String getIncidents() { return this.incidents;}
        public Zone getZone() { return zone; }
        public void setZone(Zone zone) { this.zone = zone; }



    //
    public static Roadsp Mostrar(){
            Zone z = new Zone("san lorenzo", "Commune 4", "stratum 2");
            return new Roadsp("roads with potholes", z, "five accidents");
    }


    }






