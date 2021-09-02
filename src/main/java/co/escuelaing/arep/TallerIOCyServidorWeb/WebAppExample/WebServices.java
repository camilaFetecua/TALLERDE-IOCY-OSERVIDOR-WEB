package co.escuelaing.arep.TallerIOCyServidorWeb.WebAppExample;

import co.escuelaing.arep.TallerIOCyServidorWeb.NextSpring.GetMapping;

public class WebServices {
    @GetMapping("/fecha")
    public static String date(String s){
        return java.time.LocalTime.now().toString();
    }
}
