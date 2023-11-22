public class Chip extends Item {

    private String colour;

    public Chip (int posX, int posY,boolean collected, String colour) {
        super (posX, posY, collected);
        this.colour = colour;
    }

    public void setColour () {
        this.colour = colour;
    }

    public String getColour () {
        return colour;
    }
}
