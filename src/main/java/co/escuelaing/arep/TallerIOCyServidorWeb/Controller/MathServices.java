package co.escuelaing.arep.TallerIOCyServidorWeb.Controller;


import co.escuelaing.arep.TallerIOCyServidorWeb.NextSpring.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component

public class MathServices {
    @RequestMapping("/square")
    public static Double square(String n){
        Double number=Double.valueOf(n);
        return number+number;
    }

    @RequestMapping(value="/PI")
    public static Double PI(String n ){
        //Double number = Double.valueOf(n);
        return Math.PI;
    }
    @RequestMapping(value="/strlength")
    public static String length(String s ){

        return "The length of the string is:"+s.length();
    }
}

