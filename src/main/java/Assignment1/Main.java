package Assignment1;

import Assignment1.Cars.Auto;
import Assignment1.Cars.HallitusAuto;
import Assignment1.Cars.OmaAuto;
import Assignment1.POJO.Matka;
import Assignment1.POJO.Opiskelija;
import Assignment1.Cars.VuokarAuto;

public class Main {

    public static void main(String[] args) {
        Opiskelija opiskelija = new Opiskelija("Antti", "Turku", new OmaAuto());
        Matka matka = new Matka(125, "Turku", "Lohja");
        System.out.println("Matka"+ matka.getStartingLocation() + "->" + matka.getDestination());
        pickCar(opiskelija, matka);

    }







    private static void pickCar(Opiskelija opiskelija, Matka matka) {
        Auto hallitusAuto = new HallitusAuto();
        Auto vuokraAuto = new VuokarAuto();
        if (opiskelija.getCar().aja(matka)) {
            matka.setCarUsed(opiskelija.getCar());


        } else if (hallitusAuto.aja(matka)) {
            matka.setCarUsed(hallitusAuto);

        } else {
            matka.setCarUsed(vuokraAuto);
        }
       drive(opiskelija, matka);
    }

    /**
     * @.pre opiskelija =! null && matka != null
     * choose what car we will drive.
     * @param opiskelija
     * @param matka
     */
    private static void drive(Opiskelija opiskelija, Matka matka){
        if(matka.isThereCar()) {
            opiskelija.setLocation(matka.getDestination());
            System.out.println("Matka onnistui");

            afterDrive(matka);
        }
        else {
            System.out.println("Virhe: matkalle ei ole autoa:");
        }
    }


    /**
     * Call method that makes after the trip to destination ends
     * @param matka
     */
    private static void afterDrive( Matka matka) {
            System.out.println("Ajon jälkeiset toiminnot");
            matka.getCarUsed().afterUse(matka.getCarUsed());
        }

}