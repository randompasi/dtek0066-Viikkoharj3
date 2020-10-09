package Assignment1.POJO;

import Assignment1.Cars.Auto;
import Assignment1.Cars.OmaAuto;

/**
 * POJO  for Opiskelija
 */

public class Opiskelija {

    private final String name;
    private final Auto car;
    private String location;

    public Opiskelija(String name, String location, OmaAuto car) {
        this.name = name;
        this.car = car;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public Auto getCar() {
        return  car;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
