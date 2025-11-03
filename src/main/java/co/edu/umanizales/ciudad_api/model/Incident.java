package co.edu.umanizales.ciudad_api.model;

public class Incident {


        private String descrption;
        private Zone zone ;
        private int  affectedpeople;
        private int incidentcost;

        public Incident(String Description, Zone zone, int Affectedpeople , int incidentcost){
            this.descrption  = Description;
            this.zone = zone;
            this.affectedpeople= Affectedpeople;
        }
        public String getDescrption() { return this.descrption;}
        public Zone getZone() { return zone; }
        public int getAffectedpeople() { return this.affectedpeople;}
        public int getIncidentcost() { return this.incidentcost;}


       public void setZone(Zone zone) { this.zone = zone; }


    public static Incident Mostrar(){
        Zone a = new Zone("maria", "Commune 4", "stratum 2");
        return new Incident("truck without lights", a , 100, 5000);
    }}

