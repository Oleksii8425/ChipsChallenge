enum IceType {
    BASIC,
    TOP_LEFT_CORNER,
    TOP_RIGHT_CORNER,
    BOTTOM_LEFT_CORNER,
    BOTTOM_RIGHT_CORNER
}

/**
 * A class to represent an Ice tile.
 * @author Oleksii
 * @version 1.0
 */
public class Ice extends Path {
    private IceType type;
    /**
     * Create a new Ice tile with specified x and y coordinates and stating if it is walkable or not
     * @param posX The x coordinate.
     * @param posY The y coordinate.
     * @param isWalkable Is this tile walkable or not.
     * @param type The type of ice.
     */
    public Ice(int posX, int posY, boolean isWalkable, IceType type) {
        super(posX, posY, isWalkable);
        this.type = type;
    }

    /**
     * Get the type of current ice tile.
     * @return The type of ice.
     */
    public IceType getType() {
        return this.type;
    }
}
