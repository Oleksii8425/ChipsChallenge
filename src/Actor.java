/**
 * Represents an actor with position and distance attributes.
 */

public class Actor {
    private int posX;
    private int posY;
    private int distance;

    public Actor(int posX, int posY, int distance) {
        this.posX = posX;
        this.posY = posY;
        this.distance = distance;
    }
    public Actor(){}

    public int getPosX() {
        return posX;
    }

    public void setPosX(int x) {
        this.posX = x;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int y) {
        this.posY = y;
    }

    public String getDirection() {
        // Placeholder method, replace with actual logic to get direction
        return "Direction"; // Example placeholder return value
    }

    public void setDirection(String direction) {
        // Placeholder method, replace with actual logic to set direction
    }

    public int getDistance() {
        return distance;
    }

    public void move(Direction direction) {
        switch (direction) {
            case UP:
                posY--; // Move up by decrementing Y-coordinate
                break;
            case DOWN:
                posY++; // Move down by incrementing Y-coordinate
                break;
            case LEFT:
                posX--; // Move left by decrementing X-coordinate
                break;
            case RIGHT:
                posX++; // Move right by incrementing X-coordinate
                break;
            default:
                // Handle invalid direction (if needed)
                break;
        }
    }
}

