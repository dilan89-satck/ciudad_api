package co.edu.umanizales.ciudad_api.controller;


import co.edu.umanizales.ciudad_api.model.AlumbradoP;
import co.edu.umanizales.ciudad_api.model.TipodeServicio;
import co.edu.umanizales.ciudad_api.model.TransporteP;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("prog3")

public class Prog3controller {
    // para saludar
    @GetMapping("hola campeones y campeonas")
    public String getHola() {
        System.out.println("Hola Camepeones y Campeonas");
        return "Hola Campeones y Campeonas";
    }//
//

    //  transporte

    @RestController
    @RequestMapping("transportep")
    public class Transporte{
        private final TransporteP transporte = new TransporteP("linea 1", 300);
//se llama  TransporteP para crear la instancia con los parametros
        //


        // endpoint
        @GetMapping("/ruta")
        public String getRuta() {
            return transporte.getRuta();
        }

        @GetMapping("/pasajeros")
        public int getCantidadpasajeros() {
            return transporte.getCantidadpasajeros();
        }

        @GetMapping("/transporte")
        public TransporteP getTransporteCompleto() {
            return transporte;
        }
    }//
    //

// tipo de servicio

    @RestController
    @RequestMapping("tiposdeser")
public class tiposservicio {
        private final TipodeServicio servicio = new TipodeServicio("transporte ", 3, true);

        @GetMapping("/NombredeServicio")
        public String getnombredeservicio() {
            return servicio.getNombredeServicio();
        }

        @GetMapping("/Comuna")
        public int getcomuna() {
            return servicio.getComuna();
        }

        @GetMapping("/Estado")
        public boolean getestado() {
            return servicio.getEstado();
        }//
        //

// alumbrado


    @RestController
    @RequestMapping("alumbrado")
        public class Alumbrado {
        private final AlumbradoP decoracion = new AlumbradoP("10/12","maria" , "jose");

        @GetMapping("/fecha")
        public String getFecha() {
            return decoracion.getFecha();
        }

        @GetMapping("/zona")
        public String getZona() {
            return decoracion.getZona();
        }

        @GetMapping("7empleado")
        public String getEmpleado() {
            return decoracion.getEmpleado();
        }
    }//
        //


    }}

