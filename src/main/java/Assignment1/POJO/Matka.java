package Assignment1.POJO;

import Assignment1.Cars.Auto;

/**
 * POJO  for Opiskelija
 */
public class Matka {

    private int km;
    private String startingLocation;
    private String destination;
    private Auto carUsed;



    public Matka(int km, String startingLocation, String destination) {
        this.km = km;
        this.startingLocation = startingLocation;
        this.destination = destination;

    }


    public String getStartingLocation() {
        return startingLocation;
    }



    public String getDestination() {
        return destination;
    }

    public void setCarUsed(Auto carUsed) {
        this.carUsed = carUsed;
    }

    public Auto getCarUsed() {
        return carUsed;
    }
    public boolean isThereCar(){
        return carUsed != null;
    }
}
