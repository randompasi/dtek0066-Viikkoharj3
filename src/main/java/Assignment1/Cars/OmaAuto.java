package Assignment1.Cars;

import Assignment1.POJO.Matka;

public class OmaAuto implements Auto {



    private boolean ehjä = true;



    /**
     * @.pre true
     * @param  matka Matka
     * @return RESULT = true or false with 50% change
     */
    public boolean aja(Matka matka) {
        ehjä &= new java.util.Random().nextBoolean();
        return ehjä;
    }

    /**
     * @.pre true
     * @.post ehjä = true
     */
    public void korjaa() {
        ehjä = true;
    }

    /**
     * looks is car broken
     * @.pre true
     * @return boolean
     */
    private boolean isEhjä() {
        return ehjä;
    }

    /**
     * @.pre true
     *
     * @param auto Auto
     * @.post ehjä == false -> ehjä == true
     */

    public void afterUse(Auto auto){
        if(!isEhjä()){
            korjaa();
            System.out.println("Oma auto Korjattiin: isEhjä =" + isEhjä());
        }
        System.out.println("Matka sujui omalla autolla");
    }
}
