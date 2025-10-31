package co.edu.umanizales.ciudad_api.model;

public class ServiciosP {

        private String codigo;
        private String serviciopublicos;

        public ServiciosP(String Codigo, String ServiocioPublicos) {
            this.codigo = Codigo;
            this.serviciopublicos = ServiocioPublicos;
        }

        public String getCodigo() { return codigo; }
        public String getServiciopublicos() { return serviciopublicos; }


    }


