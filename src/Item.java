/**
 * @author Nathaniel
 * @version 1.0
 * An abstract superclass for all in-game collectable items.
 */
public abstract class Item {

    protected int posX;
    protected int posY;
    protected boolean collected;


    /**
     * A constructor for items instantiating a position on the board.
     * @param posX the X co-ordinate
     * @param intY the Y co-ordinate
     * @param collected Boolean indicating if the player possesses the item
     */

    public Item (int posX, int intY, boolean collected) {
        this.posX = posX;
        this.posY = posY;
        collected = false;
    }

    /**
     *  Sets an x co-ordinate
     * @param posX the X co-ordinate
     */
    public void setPosX (int posX) {
        this.posX = posX;
    }

    /**
     *  Returns the x co-ordinate
     * @return posX - the X co-ordinate
     */
    public int getPosX () {
        return posX;
    }

    /**
     * Sets a y co-ordinate
     * @param posY
     */
    public void setPosY (int posY) {
        this.posY = posY;
    }

    /**
     *  Returns the y co-ordinate
     * @return posY - the Y co-ordinate
     */

    public int getPosY () {
        return posY;
    }

    /**
     *  Returns whether the item is in the player's possession or not
     * @return A boolean indicating whether the item has been collected or not
     */
    public boolean getCollected () {
        return collected;
    }


}
