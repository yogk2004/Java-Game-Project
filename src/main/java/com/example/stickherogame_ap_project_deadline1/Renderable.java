package com.example.stickherogame_ap_project_deadline1;


public interface Renderable {
    void render();

    // Implementing Collidable interface
    boolean checkCollision(Collidable other);
}
