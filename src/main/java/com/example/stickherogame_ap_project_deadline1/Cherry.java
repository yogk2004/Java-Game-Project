package com.example.stickherogame_ap_project_deadline1;

public class Cherry implements Renderable, Collectible, Collidable {
    private int position;

    public Cherry() {

    }

    // Implementing Renderable interface
    @Override
    public void render() {

    }

    // Implementing Collectible interface
    @Override
    public void collect() {

    }

    // Implementing Collidable interface
    @Override
    public boolean checkCollision(Collidable other) {
        return false;
    }
}