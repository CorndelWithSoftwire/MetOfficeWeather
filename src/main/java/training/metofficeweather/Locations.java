package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class Locations{
    @JsonProperty("Location")
    public List<Location> locations;

    public List<Location> getLocation() {
        return locations;
    }

    public void printAllLocations() {
        locations.stream().forEach(System.out::println);
    }

    public HashMap<String, Location> getHashMap() {
        HashMap<String, Location> myHashMap = new HashMap<>();
        locations.stream().forEach(e -> myHashMap.put(e.getName().toUpperCase(), e));
        return myHashMap;
    }

}
