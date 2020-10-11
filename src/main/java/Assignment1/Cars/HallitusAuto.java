package Assignment1.Cars;

import Assignment1.POJO.Matka;

public class HallitusAuto implements Auto {

    private boolean isUsed = false;


    /*
     * @.pre true
     * @param  matka Matka
     * @return boolean
     */
    public boolean aja(Matka matka){
        boolean temp = isUsed;
        isUsed = true;
        return !temp;
    }


    /*
     * @.pre true
     * vapauttaa auton muille ja printaa onnistumis tekstin
     * @param auto Auto
     */
   public void afterUse(Auto auto){
       isUsed = false;
       System.out.println("Hallituksen palautus onnistui ja käyttö vapautettiin: isUsed =" + isUsed);
   }
}
