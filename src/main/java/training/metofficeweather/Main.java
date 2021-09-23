package training.metofficeweather;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws JsonProcessingException {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        Client client = ClientBuilder.newClient();
        String myJsonString = client.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/sitelist?key=" + System.getenv("API_KEY"))
                .request(MediaType.TEXT_PLAIN)
                .get(String.class);

        ObjectMapper om = new ObjectMapper();
        Root root = om.readValue(myJsonString, Root.class);

        UserInterface UI = new UserInterface(sc, root.locations);
        UI.start();

    }
}




