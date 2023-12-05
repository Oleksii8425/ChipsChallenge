package com.example.playertest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class Frog extends Monster {
    private static final int VALID_MOVE_VALUE = 0; // Replace '0' with the value representing a valid move in your grid


    public Frog(int posX, int posY, int distance) {
        super(posX, posY, distance);
    }

    public void moveRandom() {
        // Implement logic to move in a random (but valid) direction
        Random random = new Random();
        Direction[] directions = Direction.values();
        Direction randomDirection = directions[random.nextInt(directions.length)];


        move(randomDirection);


        // Method to find the shortest path using BFS
        public void findShortestPath ( int playerX, int playerY, int[][] grid){
            // Define directions: UP, DOWN, LEFT, RIGHT
            int[] dx = {-1, 1, 0, 0};
            int[] dy = {0, 0, -1, 1};

            // Queue for BFS traversal
            Queue<Integer> queue = new LinkedList<>();
            queue.add(getPosX());
            queue.add(getPosY());

            boolean[][] visited = new boolean[grid.length][grid[0].length];
            visited[getPosX()][getPosY()] = true;

            while (!queue.isEmpty()) {
                int currX = queue.poll();
                int currY = queue.poll();

                // If Frog reaches the player's position, break the loop
                if (currX == playerX && currY == playerY) {
                    // Logic to move Frog towards player position
                    // Implement your logic to trace back the path and move the Frog
                    break;
                }

                // Explore adjacent cells
                for (int i = 0; i < 4; i++) {
                    int newX = currX + dx[i];
                    int newY = currY + dy[i];

                    // Check if the new position is within the grid bounds and is valid to move
                    if (newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length
                            && grid[newX][newY] == VALID_MOVE_VALUE && !visited[newX][newY]) {
                        queue.add(newX);
                        queue.add(newY);
                        visited[newX][newY] = true;
                        // You can keep track of the path or distance if needed
                        // Implement your own logic here to store path/distance information
                    }
                }
            }
        }
    }
}
