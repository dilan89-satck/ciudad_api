package co.edu.umanizales.ciudad_api.controller;


import co.edu.umanizales.ciudad_api.model.Typeofservice;
import co.edu.umanizales.ciudad_api.model.TransportP;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("prog3")

public class Prog3controller {
    // greeting endpoint
    @GetMapping("hello champions")
    public String getHello() {
        System.out.println("Hello Champions");
        return "Hello Champions";
    }

    // transport

    @RestController
    @RequestMapping("transportep")
    public class Transport {
        private final TransportP transport = new TransportP("line1 ", 300, 45);
        // TransportP is called to create the instance with the parameters


        // endpoint
        @GetMapping("/route")
        public String getRoute() {
            return transport.getRoute();
        }

        @GetMapping("/passengers")
        public int getNumberPassengers() {
            return transport.getNumberpassengers();
        }

        @GetMapping("/drivers")
        public int getNumberDrivers() {
            return transport.getNumberdrivers();
        }
    }

    // service type

    @RestController
    @RequestMapping("Typeofservice")
    public class ServiceType {
        private final Typeofservice service = new Typeofservice("transport ", 3, "active");




        // roadsp



    }


}
