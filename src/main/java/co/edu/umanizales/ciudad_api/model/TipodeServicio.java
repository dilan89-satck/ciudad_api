package co.edu.umanizales.ciudad_api.model;

import org.springframework.web.bind.annotation.GetMapping;

// enum
public class TipodeServicio {

// encapsulamiento
        private String nombredeservicio;
        private int comuna ;
        private boolean estado;

// constructor
        public TipodeServicio (String NombredeServicio , int Comuna, boolean Estado){
            this.nombredeservicio = NombredeServicio;
            this.comuna = Comuna;
            this.estado = Estado;
        }

        // getter, es para utilizar los atributos del encaposulamiento

        public String getNombredeServicio(){ return this.nombredeservicio;}
        public int getComuna() { return this.comuna; }
        public boolean getEstado() { return this.estado ;}
    //

    @Override
    public String   toString() {
        return "TipodeServicio{" +
                "nombre ='" + nombredeservicio + '\'' +
                ", comuna =" + comuna + '\'' +
                ", estado =" + estado +
                '}';
    }
}






