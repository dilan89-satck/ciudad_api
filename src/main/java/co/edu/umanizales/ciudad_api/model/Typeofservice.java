package co.edu.umanizales.ciudad_api.model;

// enum
public class Typeofservice {

// encapsulamiento
        private String servicename;
        private int commune ;
        private String state;

// constructor
        public Typeofservice(String Servicename , int Commune, String State){
            this.servicename = Servicename;
            this.commune = Commune;
            this.state = State;
        }

        // getter, es para utilizar los atributos del encaposulamiento

        public String getServicename(){ return this.servicename;}
        public int getCommune() { return this.commune; }
        public String getState() { return this.state ;}
    //

    @Override
    public String   toString() {
        return "Typeofservice{" +
                "Servicename ='" + servicename + '\'' +
                ", Commune =" + commune + '\'' +
                ", State =" + state +
                '}';
    }
}






