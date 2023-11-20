/**
 * A class to represent a Button.
 * @author Oleksii
 * @version 1.0
 */
public class Button {
    private int posX;
    private int posY;
    private Trap trap;

    /**
     * Create a new Button with specified x and y coordinates and a trap which is controlled by the button.
     * @param posX The x coordinate.
     * @param posY The y coordinate.
     * @param trap A connected trap.
     */
    public Button(int posX, int posY, Trap trap) {
        this.posX = posX;
        this.posY = posY;
        this.trap = trap;
    }

    /**
     * A function to get a trap the button is connected to.
     * @return The connected trap.
     */
    public Trap getTrap() {
        return this.trap;
    }

    /**
     * An event that occurs when the button is stepped on.
     */
    public void steppedOn() {
        this.trap.setIsActivated(true);
    }
}
