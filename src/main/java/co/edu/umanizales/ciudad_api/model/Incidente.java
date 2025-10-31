package co.edu.umanizales.ciudad_api.model;

public class Incidente {


        private String descripcion;
        private String zona ;
        private int  personasafectadas;
        private int costodeincidente;

        public Incidente (String Descripcion, String Zona, int PersonasAfectadas , int CostoIncidente){
            this.descripcion  = Descripcion;
            this.zona = Zona;
            this.personasafectadas = PersonasAfectadas;
        }
        public String getDescripcion() { return this.descripcion;}
        public String getZona() { return  this.zona;}
        public  int  getPesonasAfectadas() { return this.personasafectadas;}
        public int getCostodeincidente() { return this.costodeincidente;}


    }

