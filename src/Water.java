/**
 * A class representing Water tile
 * @author Oleksii
 * @version 1.0
 */
public class Water extends Path{
    /**
     * Create a new Water tile with specified x and y coordinates and stating if it is walkable or not
     * @param posX The x coordinate.
     * @param posY The y coordinate.
     * @param isWalkable Is this tile walkable or not.
     */
    public Water(int posX, int posY, boolean isWalkable) {
        super(posX, posY, isWalkable);
    }
}
