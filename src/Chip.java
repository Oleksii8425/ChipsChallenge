/**
 * @author Nathaniel
 * @version 1.0
 * Implements the idea class to create chip items.
 */
public class Chip extends Item{

    /**
     * A constructor creating chip items.
     * @param posX
     * @param posY
     * @param collected
     * @param image
     */

    public Chip (int posX, int posY, boolean collected, Image image){
        super (posX, posY, collected, image);
    }
}