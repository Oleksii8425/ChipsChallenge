enum Color {
    RED,
    GREEN,
    BLUE,
    YELLOW
}
/**
 * A class to represent a Door.
 * @author Oleskii
 * @version 1.0
 */
public class Door extends Path {
    private boolean isClosed;
    private Color color;

    /**
     * Create a new Path tile with specified x and y coordinates and stating if it is walkable or not
     * @param posX The x coordinate.
     * @param posY The y coordinate.
     * @param isWalkable Is this tile walkable or not.
     * @param isClosed Is the door closed.
     * @param color The color of the door.
     */
    public Door(int posX, int posY, boolean isWalkable, boolean isClosed, Color color) {
        super(posX, posY, isWalkable);
        this.isClosed = isClosed;
        this.color = color;
    }

    /**
     * A function to get the color of the door.
     * @return The color of the door.
     */
    public Color getColor() {
        return this.color;
    }

    /**
     * A function to determine if the door is closed.
     * @return True if the door is closed, false otherwise.
     */
    public boolean isClosed() {
        return this.isClosed;
    }
}
