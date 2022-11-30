package com.epam.OOP;

public class Bird extends Animal {

    public Bird() {
        super("blue", 2, false);
    }

    public Bird(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Moreover, it has 2 wings and can fly.";
    }

}
