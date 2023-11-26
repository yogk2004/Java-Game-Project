package com.example.stickherogame_ap_project_deadline1;

public class StickHeroPlayer implements Renderable,Collidable {
    private Score score;
    private int position;
    private boolean isFlipped;

    public void Player() {

    }

    public void move(int distance) {

    }

    public void flipUpsideDown() {

    }

    public void increaseScore(int points) {

    }

    // Implementing Renderable interface
    @Override
    public void render(){

    };

    // Implementing Collidable interface
    @Override
    public boolean checkCollision(Collidable other){
        return false;
    };
}

