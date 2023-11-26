package com.example.stickherogame_ap_project_deadline1;

public class Platform implements Renderable, Collidable {
    private int width;
    private int position;

    public Platform() {
    }

    // Implementing Renderable interface
    @Override
    public void render() {

    }

    // Implementing Collidable interface
    @Override
    public boolean checkCollision(Collidable other) {


        return false;
    }
}
