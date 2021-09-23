package training.metofficeweather;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class UserInterface {
    private Scanner sc;
    private Locations locations;

    public UserInterface(Scanner initScanner, Locations initLocations) {
        this.sc = initScanner;
        this.locations = initLocations;
    }

    public void start() {

        // [location name:  location object]
        HashMap<String, Location> myHashMap = this.locations.getHashMap();

        while (true) {
            instructions();

            int input = sc.nextInt();

            // break condition
            if (input == 0) {
                break;
            }

            switch (input) {
                case 1:
                    this.locations.printAllLocations();
                    break;
                case 2:
                    Scanner case2SC = new Scanner(System.in);
                    System.out.println("Enter location");
                    String locationName = case2SC.nextLine();
                    System.out.println(myHashMap.get(locationName.toUpperCase()));
                    break;
            }
        }
    }

    private void instructions() {
        System.out.println("Please select options:");
        System.out.println("1: print all locations' details");
        System.out.println("2: print a desired location's detail");
        System.out.println("0: to quit");
    }


}
