/**
 * A class to represent an Exit tile.
 * @author Oleksii
 * @version 1.0
 */
public class Exit extends Path {
    /**
     * Create a new Exit tile with specified x and y coordinates and stating if it is walkable or not
     * @param posX The x coordinate.
     * @param posY The y coordinate.
     * @param isWalkable Is this tile walkable or not.
     */
    public Exit(int posX, int posY, boolean isWalkable) {
        super(posX, posY, isWalkable);
    }
}
