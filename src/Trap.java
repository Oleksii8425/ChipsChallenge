/**
 * A class to represent a Trap.
 * @author Oleksii
 * @version 1.0
 */
public class Trap extends Path {
    private boolean isActivated;

    /**
     * Create a new Trap tile with specified x and y coordinates and stating if it is walkable or not
     * @param posX The x coordinate.
     * @param posY The y coordinate.
     * @param isWalkable Is this tile walkable or not.
     */
    public Trap(int posX, int posY, boolean isWalkable, boolean isActivated) {
        super(posX, posY, isWalkable);
        this.isActivated = isActivated;
    }

    public void setIsActivated(boolean isActivated) {
        this.isActivated = isActivated;
    }

    /**
     * A function that tells if the trap is activated.
     * @return True if the trap is activated, false otherwise.
     */
    public boolean isActivated() {
        return this.isActivated;
    }
}
