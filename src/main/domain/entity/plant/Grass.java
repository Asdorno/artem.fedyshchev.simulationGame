package entity.plant;

import entity.Entity;

public class Grass extends Plant {
    public static int grassCounter = 0;

    public Grass(String name) {
        super(name);
    }

    @Override
    public Grass reproduce() {
        return null;
    }
}
