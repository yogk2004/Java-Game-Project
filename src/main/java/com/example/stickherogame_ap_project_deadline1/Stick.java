package com.example.stickherogame_ap_project_deadline1;

public class Stick implements Renderable, Collidable {
    private int length;

    public Stick() {

    }

    public void extend() {

    }

    public void shorten() {

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