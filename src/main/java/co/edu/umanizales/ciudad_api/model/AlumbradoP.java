package co.edu.umanizales.ciudad_api.model;

// hacer herencia para empleado y zona
public class AlumbradoP {

        private String fecha;
        private String zona;
        private String empleado;

        public AlumbradoP (String Fecha, String Zona, String Empleado){
            this.fecha = Fecha;
            this.zona = Zona;
            this.empleado= Empleado;
        }
        public String getFecha() { return this.fecha;}
        public String getZona() { return  this.zona;}
        public  String getEmpleado() { return this.empleado;}


    }


