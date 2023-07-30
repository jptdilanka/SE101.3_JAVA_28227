package com.mycompany.demonstrate;
public class PlayerCharacter implements PlayerController {
    @Override
    public void moveUp() {
        System.out.println("Player moved UP.");
    }

    @Override
    public void moveDown() {
        System.out.println("Player moved DOWN.");
    }

    @Override
    public void moveLeft() {
        System.out.println("Player moved LEFT.");
    }

    @Override
    public void moveRight() {
        System.out.println("Player moved RIGHT.");
    }
}
