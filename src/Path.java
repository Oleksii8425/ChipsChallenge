/**
 * A class representing a Path tile
 * @author Oleksii
 * @version 1.0
 */
public class Path {

    private int posX;
    private int posY;
    private boolean isWalkable;

    /**
     * Create a new Path tile with specified x and y coordinates and stating if it is walkable or not
     * @param posX The x coordinate.
     * @param posY The y coordinate.
     * @param isWalkable Is this tile walkable or not.
     */
    public Path(int posX, int posY, boolean isWalkable) {
        this.posX = posX;
        this.posY = posY;
        this.isWalkable = isWalkable;
    }

    /**
     * Get current y coordinate.
     * @return The y coordinate.
     */
    public int getPosY() {
        return posY;
    }

    /**
     * Set a new y coordinate.
     * @param posY New y coordinate.
     */
    public void setPosY(int posY) {
        this.posY = posY;
    }

    /**
     * Get current x coordinate.
     * @return The x coordinate.
     */
    public int getPosX() {
        return posX;
    }

    /**
     * Set a new x coordinate.
     * @param posX New x coordinate.
     */
    public void setPosX(int posX) {
        this.posX = posX;
    }

    /**
     * Get a value specifying if the tile can be walked on.
     * @return True if current tile can be walked on, false otherwise.
     */
    public boolean isWalkable() {
        return isWalkable;
    }

    /**
     * Called when any of the actors stepped on this tile to perform some actions.
     */
    public void steppedOn() {

    }
}
