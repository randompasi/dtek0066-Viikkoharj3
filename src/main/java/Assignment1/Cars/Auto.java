package Assignment1.Cars;

import Assignment1.POJO.Matka;

public interface Auto {


    /**
     * @.pre true
     * @param  matka Matka
     * @return boolean
     */
    public boolean aja(Matka matka);


    /**
     * @.pre true && auto != null
     * @param auto Auto
     *
     */
    public void afterUse(Auto auto);
}
