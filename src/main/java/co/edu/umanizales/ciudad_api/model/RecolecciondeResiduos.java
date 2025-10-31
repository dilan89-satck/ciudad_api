package co.edu.umanizales.ciudad_api.model;

public class RecolecciondeResiduos {

        private String zona;
        private int  cantidadenkg;
        private String barriomassucio;

        public RecolecciondeResiduos (String Zona, int CantidadenKG, String BarriomasSucio){
            this.zona = Zona;
            this.cantidadenkg = CantidadenKG;
            this.barriomassucio= BarriomasSucio;
        }
        public String getZona() { return this.zona;}
        public String getBarriomasSucio() { return  this.barriomassucio;}
        public  int getCantidadenKG() { return this.cantidadenkg;}



    }

