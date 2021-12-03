package training.metofficeweather;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import training.metofficeweather.Locations.Location;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

@SpringBootApplication
public class WeatherApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(WeatherApplication.class, args);

		Client client = ClientBuilder.newClient();
		String name = client.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/sitelist?key=7fa09da3-6462-45ee-a7da-445fbc9aa1b1")
				.request(MediaType.TEXT_PLAIN)
				.get(String.class);



		ObjectMapper objectMapper = new ObjectMapper();
		MetOfficeLocation metOfficeLocation = new MetOfficeLocation();


		try
		{
			metOfficeLocation = objectMapper.readValue(name, MetOfficeLocation.class);
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}

		for (Location location : metOfficeLocation.locations.locations)
		{
			System.out.println(location.name);
		}







	}

}
