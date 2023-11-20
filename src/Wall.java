/**
 * A class representing Wall tile
 * @author Oleksii
 * @version 1.0
 */
public class Wall extends Path{

    /**
     * Create a new Wall tile with specified x and y coordinates and stating if it is walkable or not
     * @param posX The x coordinate.
     * @param posY The y coordinate.
     * @param isWalkable Is this tile walkable or not.
     */
    public Wall(int posX, int posY, boolean isWalkable) {
        super(posX, posY, isWalkable);
    }
}
