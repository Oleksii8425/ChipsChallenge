public class Actor {
    private int posX;
    private int posY;
    private int distance;

    public Actor(int posX, int posY, int distance) {
        this.posX = posX;
        this.posY = posY;
        this.distance = distance;
    }

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

    public void move(String direction) {
        // Placeholder method, replace with actual logic to move based on direction
        System.out.println("Moving in direction: " + direction);
    }
}
