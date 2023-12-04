package com.example.playertest;

public class Bug extends Monster {
    private boolean followsLeftEdge;

    public Bug(int posX, int posY, boolean followsLeftEdge) {
        super(posX, posY, 1); // Assuming distance/speed for Bug is set to 1
        this.followsLeftEdge = followsLeftEdge;
    }

    public void followEdge() {

        int currentX = getPosX();
        int currentY = getPosY();

        if (followsLeftEdge) {
            // Try to follow the left edge
            if (isPath(currentX - 1, currentY)) {
                // Move left
                setPosX(currentX - 1);
                setPosY(currentY);
            } else if (isPath(currentX, currentY - 1)) {
                // Move up
                setPosX(currentX);
                setPosY(currentY - 1);
            } else if (isPath(currentX + 1, currentY)) {
                // Move right
                setPosX(currentX + 1);
                setPosY(currentY);
            } else {
                // Move down
                setPosX(currentX);
                setPosY(currentY + 1);
            }
        } else {
            if (isPath(currentX + 1, currentY)) {
                // Move right
                setPosX(currentX + 1);
                setPosY(currentY);
            } else if (isPath(currentX, currentY - 1)) {
                // Move up
                setPosX(currentX);
                setPosY(currentY - 1);
            } else if (isPath(currentX - 1, currentY)) {
                // Move left
                setPosX(currentX - 1);
                setPosY(currentY);
            } else {
                // Move down
                setPosX(currentX);
                setPosY(currentY + 1);
            }
        }
    }
}
