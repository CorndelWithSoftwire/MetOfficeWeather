package training.metofficeweather;

public class Location{
    public String elevation;
    public String id;
    public String latitude;
    public String longitude;
    public String name;
    public String region;
    public String unitaryAuthArea;
    public String obsSource;
    public String nationalPark;

    @Override
    public String toString() {
        return  "name = " + name +
                ", id = " + id +
                ", region = " + region +
                ", unitaryAuthArea = " + unitaryAuthArea +
                ", elevation = " + elevation +
                ", latitude = " + latitude +
                ", longitude = " + longitude +
                (obsSource != null ?", obsSource=" + obsSource :"") +
                (nationalPark != null ? ", nationalPark=" + nationalPark :"")
                ;
    }

    public String getElevation() {
        return elevation;
    }

    public String getId() {
        return id;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getUnitaryAuthArea() {
        return unitaryAuthArea;
    }

    public String getObsSource() {
        return obsSource;
    }

    public String getNationalPark() {
        return nationalPark;
    }
}

