package co.escuelaing.arep.TallerIOCyServidorWeb.WebAppExample;

import org.springframework.web.bind.annotation.GetMapping;

public class MathServices {
    @GetMapping("/square")
    public static Double square(String n){
        Double number=Double.valueOf(n);
        return number+number;
    }

    @GetMapping(value="/PI")
    public static Double PI(String n ){
        //Double number = Double.valueOf(n);
        return Math.PI;
    }
    @GetMapping(value="/strlength")
    public static String length(String s ){
        return "The length of the string is:"+s.length();
    }
}

