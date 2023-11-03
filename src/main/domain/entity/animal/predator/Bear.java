package entity.animal.predator;

import entity.Entity;

public class Bear extends Predator {
    public static int bearCounter = 0;
    private int hunger;

    public Bear(String name) {
        super(name+bearCounter++);
    }

    @Override
    public Bear reproduce() {
        return null;
    }
    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
}
