package control;





import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import javax.jws.WebResult;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.util.JAXBSource;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
/*
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
*/
import model.CV.Cv;
import model.CV.Langue;
import model.CV.Liste;


/**
 * Created by Saad on 24/04/2015.
 */
public class ClientControl {
    
    
    public static Liste GetService()  throws IOException, JAXBException{

        URL url = new URL("http://localhost:8080/Serveur_Lw2/rest/resume");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/xml");

        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
        String apiOutput = br.readLine();
        //System.out.println(apiOutput);
        conn.disconnect();

        JAXBContext jaxbContext = JAXBContext.newInstance(Liste.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Liste listeDeCV = (Liste) jaxbUnmarshaller.unmarshal(new StringReader(apiOutput));

        return listeDeCV;
    }
    /*
    public static void post(){

        Client client = Client.create();
        WebResource webResource = client.resource("https://projetd.herokuapp.com/rest/resume/add");
        ClientResponse clientResponse = webResource.accept("application/xml").post(ClientResponse.class , cv);


    }
*/
    public static void main(String[] args) throws IOException, JAXBException {


       // SendXmlToServerWithPost(cv);
        System.out.println("fin");


    }


}
