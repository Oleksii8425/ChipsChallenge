public class Dirt extends Path {
    /**
     * Create a new Dirt tile with specified x and y coordinates and stating if it is walkable or not
     * @param posX       The x coordinate.
     * @param posY       The y coordinate.
     * @param isWalkable Is this tile walkable or not.
     */
    public Dirt(int posX, int posY, boolean isWalkable) {
        super(posX, posY, isWalkable);
    }
}
