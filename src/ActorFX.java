package com.example.playertest;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;



public class ActorFX extends Application {

    // The dimensions of the window
    private static final int WINDOW_WIDTH = 600;
    private static final int WINDOW_HEIGHT = 400;

    // The dimensions of the canvas
    private static final int CANVAS_WIDTH = 400;
    private static final int CANVAS_HEIGHT = 400;

    // The size to draw the shapes
    private static final int SHAPE_SIZE = 30;

    private Player player1;
    private Player pinkBall;
    private Player frog;
    private Player block;
    private Player bug;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("2D Java Game");

        // Set up the main game scene
        StackPane root = new StackPane();
        Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);


        // Initialize players with images
        player1 = new Player(new Image("player1.png"), WINDOW_WIDTH / 4, WINDOW_HEIGHT / 2);
        pinkBall = new Player(new Image("pinkBall.png"), WINDOW_WIDTH * 3 / 4, WINDOW_HEIGHT / 2);
        frog = new Player(new Image("frog.png"), WINDOW_WIDTH * 3/4, WINDOW_HEIGHT / 2);
        block = new Player(new Image("block.png"), WINDOW_WIDTH * 3/4, WINDOW_HEIGHT / 2);
        bug = new Player(new Image("bug.png"), WINDOW_WIDTH * 3/4, WINDOW_HEIGHT / 2);

        // Set up the game loop using a Timeline
        Timeline gameLoop = new Timeline(new KeyFrame(Duration.millis(16), this::update));
        gameLoop.setCycleCount(Animation.INDEFINITE);
        gameLoop.play();

        // Handle player movement
        scene.setOnKeyPressed(e -> handleKeyPress(e.getCode()));
        scene.setOnKeyReleased(e -> handleKeyRelease(e.getCode()));

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    private void update(ActionEvent event) {
        // Update game logic here (e.g., move players, check collisions)

        // Clear the canvas
        GraphicsContext gc = ((Canvas) ((StackPane) ((Scene) event.getSource()).getRoot()).getChildren().get(0)).getGraphicsContext2D();
        gc.clearRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);


        // Draw players
        player1.draw(gc);
        pinkBall.draw(gc);
        frog.draw(gc);
        block.draw(gc);
        bug.draw(gc);
    }


    private void handleKeyPress(javafx.scene.input.KeyCode code) {

        // Handle player movement based on key press
        player1.handleKeyPress(code);
        pinkBall.handleKeyPress(code);
        frog.handleKeyPress(code);
        block.handleKeyPress(code);
        bug.handleKeyPress(code);
    }

    private void handleKeyRelease(javafx.scene.input.KeyCode code) {
        // Handle any necessary actions when a key is released
        player1.handleKeyRelease(code);
        pinkBall.handleKeyRelease(code);
        frog.handleKeyRelease(code);
        block.handleKeyRelease(code);
        bug.handleKeyRelease(code);
    }

    // player class representing a player character
    private class Player {
        private Image image;
        private double x;
        private double y;
        private double speed = 5;

        Player(Image image, double x, double y) {
            this.image = image;
            this.x = x;
            this.y = y;
        }

        void draw(GraphicsContext gc) {
            gc.drawImage(image, x, y);
        }

        void handleKeyPress(javafx.scene.input.KeyCode code) {
            // Handle player movement based on key press
            switch (code) {
                case UP:
                    y -= speed;
                    break;
                case DOWN:
                    y += speed;
                    break;
                case LEFT:
                    x -= speed;
                    break;
                case RIGHT:
                    x += speed;
                    break;
            }
        }

        void handleKeyRelease(javafx.scene.input.KeyCode code) {
            // Handle any necessary actions when a key is released
        }
    }
}




