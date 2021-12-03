package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import training.metofficeweather.Locations.Locations;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MetOfficeLocation
{
    @JsonProperty(value = "Locations")
    public Locations locations;
}
