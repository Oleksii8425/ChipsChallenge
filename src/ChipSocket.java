/**
 * A class to represent a ChipSocket.
 * @author Oleksii
 * @version 1.0
 */
public class ChipSocket extends Path {
    /**
     * Create a new ChipSocket tile with specified x and y coordinates and stating if it is walkable or not
     * @param posX The x coordinate.
     * @param posY The y coordinate.
     * @param isWalkable Is this tile walkable or not.
     */
    public ChipSocket(int posX, int posY, boolean isWalkable) {
        super(posX, posY, isWalkable);
    }
}
