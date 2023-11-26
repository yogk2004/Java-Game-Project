package com.example.stickherogame_ap_project_deadline1;

import java.util.List;


public class GameController implements Updatable {
    private List<Platform> platforms;
    private GameState currentState;
    private Cherry cherry;

    public GameController() {

    }

    public Platform generatePlatform() {
        return null;
    }

    public boolean checkCollision(StickHeroPlayer player, Stick stick) {
        return false;
    }

    public Cherry generateCherry() {
        return null;
    }

    public boolean checkCherryCollision(StickHeroPlayer player) {


        return false;
    }

    // Implementing Updatable interface
    @Override
    public void update() {
    }

}
