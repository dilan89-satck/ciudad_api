package co.edu.umanizales.ciudad_api.controller;


import co.edu.umanizales.ciudad_api.model.Typeofservice;
import co.edu.umanizales.ciudad_api.model.TransportP;


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
        private final TransportP transport = new TransportP("line1 ", 300, 45);
//se llama  TransporteP para crear la instancia con los parametros
        //


        // endpoint
        @GetMapping("/route")
        public String getroute() {
            return transport.getRoute();
        }

        @GetMapping("/passengers")
        public int Numberpassengers() {
            return transport.getNumberpassengers();
        }

        @GetMapping("/drivers")
        public int  Numberdrivers() {
            return transport.getNumberdrivers();
        }
    }//
    //

// tipo de servicio

    @RestController
    @RequestMapping("Typeofservice")
public class tiposservicio {
        private final Typeofservice servicio = new Typeofservice("transporte ", 3, "activo");




// roadsp



    }//
        //


    }
