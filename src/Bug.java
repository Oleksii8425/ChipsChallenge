package com.example.playertest;
/**
        * This class represents a Bug which is a type of Monster.
        * It .
        * @author .
 */
public class Bug extends Monster {
    private final static int BUG_SPEED = 1;
    private final static int MOVE_ONE_POSITION = 1;
    private boolean followsLeftEdge;

    /**
     * This creates a Bug, with a position
     * @param posX
     * @param posY
     * @param followsLeftEdge
     */
    public Bug(int posX, int posY, boolean followsLeftEdge) {
        super(posX, posY, BUG_SPEED); // Assuming distance/speed for Bug is set to 1
        this.followsLeftEdge = followsLeftEdge;
    }

    public void followEdge() {
        int currentX = getPosX();
        int currentY = getPosY();

        // Assume there are methods available to check available paths (isPath(), isBlocked(), etc.)

        if (followsLeftEdge) {
            // Try to follow the left edge
            if (isPath(currentX - MOVE_ONE_POSITION, currentY)) {
                // Move left
                setPosX(currentX - MOVE_ONE_POSITION);
                setPosY(currentY);
            } else if (isPath(currentX, currentY - MOVE_ONE_POSITION)) {
                // Move up
                setPosX(currentX);
                setPosY(currentY - MOVE_ONE_POSITION);
            } else if (isPath(currentX + MOVE_ONE_POSITION, currentY)) {
                // Move right
                setPosX(currentX + 1);
                setPosY(currentY);
            } else {
                // Move down
                setPosX(currentX);
                setPosY(currentY + MOVE_ONE_POSITION);
            }
        } else {
            if (isPath(currentX + MOVE_ONE_POSITION, currentY)) {
                // Move right
                setPosX(currentX + MOVE_ONE_POSITION);
                setPosY(currentY);
            } else if (isPath(currentX, currentY - MOVE_ONE_POSITION)) {
                // Move up
                setPosX(currentX);
                setPosY(currentY - MOVE_ONE_POSITION);
            } else if (isPath(currentX - MOVE_ONE_POSITION, currentY)) {
                // Move left
                setPosX(currentX - MOVE_ONE_POSITION);
                setPosY(currentY);
            } else {
                // Move down
                setPosX(currentX);
                setPosY(currentY + MOVE_ONE_POSITION);
            }
        }
    }
}
