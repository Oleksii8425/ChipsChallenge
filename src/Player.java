import java.util.ArrayList;
import java.util.List;

public class Player extends Actor {
    private String name;
    // private List<Item> inventory; // only works with an item class present

    /**
     * Constructor for the Player class.
     *
     * @param posX  The initial X-coordinate position of the player.
     * @param posY  The initial Y-coordinate position of the player.
     * @param name  The player name.
     */
    public Player(int posX, int posY, String name) {
        super(posX, posY, 1);
        this.name = name;
       // this.inventory = new ArrayList<>();
    }

    /**
     * Checks if the player is alive.
     *
     * @return true if the player is alive, false otherwise.
     */
    public boolean isAlive() {
        // Logic to determine player's status (alive/dead)
        return true; // Placeholder logic, you can add your conditions here
    }

    /**
     * Adds an item to the player's inventory.
     *
     * @param item The item to be added to the inventory.
     */
   /**public void addToInventory(Item item) {
       inventory.add(item);
} */

    /**
     * Gets the player's inventory.
     *
     * @return List containing the items in the player's inventory.
     */
    //public List<Item> getInventory() {
    //    return inventory;
   // }
}
