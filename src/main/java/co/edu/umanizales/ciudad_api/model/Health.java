package co.edu.umanizales.ciudad_api.model;

public class Health {

// record
        private double numberdeaths  ;
        private double recovereds;

        public Health(int Numberdeaths, int Recovereds){
            this.numberdeaths = Numberdeaths;
            this.recovereds = Recovereds;

        }
        public double getRecovered(){ return this.recovereds;}
        public double getNumberdeaths(){ return this.numberdeaths;}


    public static Health Mostrar(){
        return new Health (5, 20);
    }

}


