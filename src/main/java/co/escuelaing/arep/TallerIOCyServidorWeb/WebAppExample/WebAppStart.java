package co.escuelaing.arep.TallerIOCyServidorWeb.WebAppExample;

import co.escuelaing.arep.TallerIOCyServidorWeb.HttpServer.HttpServer;

import java.io.IOException;
import java.net.URISyntaxException;
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
}