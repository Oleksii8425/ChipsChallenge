/**
 * @author Nathaniel
 * @version 1.0
 * Implements the item class to create key items.
 */
public class Key extends Item {

    private String colour;

    /**
     * A constructor to instantiate keys.
     * @param posX
     * @param posY
     * @param collected
     * @param colour
     */
    public Key(int posX, int posY, boolean collected, String colour) {
        super (posX, posY, collected);
        this.colour = colour;
    }

    /**
     *  Sets the colour of the key.
     * @param colour The colour of the key.
     */
    public void setColour (String colour) {
        this.colour = colour;
    }

    /**
     * Returns the colour of the key.
     * @return the String value indicating the key's colour.
     */
    public String getColour () {
        return colour;
    }
}