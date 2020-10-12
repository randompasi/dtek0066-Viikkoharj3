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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public Filling getFilling() {
        return filling;
    }

    public void setFilling(Filling filling) {
        this.filling = filling;
    }










}
