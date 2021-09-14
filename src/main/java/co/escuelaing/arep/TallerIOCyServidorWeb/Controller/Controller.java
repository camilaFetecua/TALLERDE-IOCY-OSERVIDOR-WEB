package co.escuelaing.arep.TallerIOCyServidorWeb.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class Controller {
    @RequestMapping("/hola")
        public String index() {
            return "Greetings from Spring Boot!";
        }
}

