package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Location
{
    public String elevation;
    public String id;
    public String latitude;
    public String longitude;
    public String name;
    public String region;
    public String unitaryAuthArea;

}
