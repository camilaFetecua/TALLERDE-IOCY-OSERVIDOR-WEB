package co.escuelaing.arep.TallerIOCyServidorWeb.WebAppExample;

import co.escuelaing.arep.TallerIOCyServidorWeb.HttpServer.HttpServer;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WebAppStart {
    public static void main(String[] args) {
        try {
            HttpServer.getInstance().startServer(args);
        } catch (IOException ex) {
            Logger.getLogger(WebAppStart.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(WebAppStart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static List<String> getAnnotattionC(File archivo){
        List<String> resp= new ArrayList<>();
        if(archivo.isDirectory()){
            for(File fileEntry:archivo.listFiles()){
                resp.addAll(getAnnotattionC(fileEntry));
            }
        }else{
            if(archivo.getName().endsWith(".java")){
                String [] pathArr = archivo.getPath().replace(".java", "").split("\\\\");
                String clas="";
                for(int i=4;i<pathArr.length;i++){
                    clas+=(i==pathArr.length-1)? pathArr[i]:pathArr[i]+".";
                }
                try{
                    Class clase = Class.forName(clas);
                    if(clase.isAnnotationPresent(Component.class)){
                        resp.add(clas);
                    }
                }catch(ClassNotFoundException e) {
                    Logger.getLogger(WebAppStart.class.getName()).log(Level.SEVERE, "El componente no se encuentra", e);
                }
            }
        }
        return resp;
    }

}