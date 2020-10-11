package Assignment1.Cars;

import Assignment1.POJO.Matka;

public class VuokarAuto implements Auto {


    /*
     * @.pre true
     * @param  matka Matka
     * @return boolean
     */
    public boolean aja(Matka matka){
        return true;
    }


    /*
     * makes call for the payment if user return right car
     * @param auto Auto
     *
     */
    public void afterUse(Auto auto){
        if(auto == this) {
            //method for payment
            //pay()
            System.out.println("Auto palautettiin vuokraamolle ja maksettiin vuokra");
        }
        else {
            System.out.println("Palautettu auto ei ollut vuokraAuto");
        }
    }
}
