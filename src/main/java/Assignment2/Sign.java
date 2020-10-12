package Assignment2;

public class Sign {

    private String text;
    private Dimension dimension;
    private Filling filling;

    public Sign(Dimension signDimension, Filling filling, String text) {
        this.text = text;
        this.dimension = signDimension;
        this.filling = filling;
    }




    /**

     * @.pre true
     * @.post RESULT == (text)
     */
    public String getText() {
        return text;
    }


    /**

     * @.pre true
     * @.post RESULT == (dimension)
     */
    public Dimension getDimension() {
        return dimension;
    }


    /**
     @.pre dimension != null
     @.post getDimension.equals(dimension)
     */
    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }



    /**

     * @.pre true
     * @.post RESULT == (filling)
     */
    public Filling getFilling() {
        return filling;
    }



    /**
     @.pre filling != null
     @.post getfilling.equals(filling)
     */
    public void setFilling(Filling filling) {
        this.filling = filling;
    }










}
