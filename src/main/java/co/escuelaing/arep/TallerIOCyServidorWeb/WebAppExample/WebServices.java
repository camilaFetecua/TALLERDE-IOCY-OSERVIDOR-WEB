package co.escuelaing.arep.TallerIOCyServidorWeb.WebAppExample;

import co.escuelaing.arep.TallerIOCyServidorWeb.NextSpring.Component;
import co.escuelaing.arep.TallerIOCyServidorWeb.NextSpring.RequestMapping;

@Component
public class WebServices {
    @RequestMapping("/fecha")
    public static String fecha(String s){

        return java.time.LocalTime.now().toString();
    }
}
