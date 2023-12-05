package com.example.playertest;

import javafx.scene.image.Image;

public class Player extends Actor {
    private String name;
    private Image playerImage;
    private boolean isAlive;

    public Player(int posX, int posY, String name, Image playerImageFilePath) {
        super(posX, posY, 1); // Assuming distance/speed for the player is set to 1
        this.name = name;
        this.playerImage = playerImageFilePath;
        this.isAlive = true;
    }

    public Image getPlayerImage() {
        return playerImage;
    }

    public void move(Direction direction) {
        switch (direction) {
            case UP:
                setPosY(getPosY() - 1);
                break;
            case DOWN:
                setPosY(getPosY() + 1);
                break;
            case LEFT:
                setPosX(getPosX() - 1);
                break;
            case RIGHT:
                setPosX(getPosX() + 1);
                break;
            default:
                // Handle other cases if needed
                break;
        }
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        this.isAlive = alive;
    }

    public boolean checkCollisionWithMonster(Monster[] monsters) {
        for (Monster monster : monsters) {
            if (this.getPosX() == monster.getPosX() && this.getPosY() == monster.getPosY()) {
                this.isAlive = false; // Player dies on collision with a Monster
                return true; // Collision occurred
            }
        }
        return false; // When there is no collision
    }
}



