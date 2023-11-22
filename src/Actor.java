/**
 * @author Anna Hardy, Morgan Greenway, Adhya Singh
 * Represents an actor with position and distance attributes.
 */
public class Actor {
    private int posX;
    private int posY;
    private int distance;

    /**
     * Constructor for the Actor class.
     *
     * @param posX     The initial X-coordinate position of the actor.
     * @param posY     The initial Y-coordinate position of the actor.
     * @param distance The distance attribute of the actor.
     */
    public Actor(int posX, int posY, int distance) {
        this.posX = posX;
        this.posY = posY;
        this.distance = distance;
    }
    public Actor(){}
       
    /**
     * Gets the X-coordinate position of the actor.
     *
     * @return The X-coordinate position.
     */


    public int getPosX() {
        return posX;
    }
        /**
     * Sets the X-coordinate position of the actor.
     *
     * @param x The new X-coordinate position.
     */


    public void setPosX(int x) {
        this.posX = x;
    } 
     /**
     * Gets the Y-coordinate position of the actor.
     *
     * @return The Y-coordinate position.
     */

    public int getPosY() {
        return posY;
    }
          /**
     * Sets the Y-coordinate position of the actor.
     *
     * @param y The new Y-coordinate position.
     */

    public void setPosY(int y) {
        this.posY = y;
    }
        /**
     * Gets the direction of the actor's movement.
     *
     * @return The direction of movement.
     */

    public String getDirection() {
        
        return "Direction"; 
    }
        
    /**
     * Sets the direction of the actor's movement.
     *
     * @param direction The new direction of movement.
     */


    public void setDirection(String direction) {
       
    }
       
    /**
     * Gets the distance attribute of the actor.
     *
     * @return The distance attribute.
     */


    public int getDistance() {
        return distance;
    }

    public void move(String direction) {}

}
